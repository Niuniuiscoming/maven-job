package com.imooc.maven01.maven_job;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Properties;

import sun.misc.ProxyGenerator;

import com.sun.corba.se.impl.encoding.CodeSetConversion.BTCConverter;


/**
 * 
 * @author Administrator
 * 参考：
 * http://zhangjunhd.blog.51cto.com/113473/69996
 */

public class DynamicProxyDemo {
    
	public static void consumer(Action action){
		action.operation1();
		action.operation2("zj");
	}
	
	public static void main (String[] args) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
		/**
		 *	参考：
		 *	http://yy5020.iteye.com/blog/681430
		 *
		 */
		/*Field field = System.class.getDeclaredField("props");  
	    field.setAccessible(true);  
	    Properties props = (Properties) field.get(null);  
	    props.put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");  
	  
	   Package pkg = DynamicProxyDemo.class.getPackage();  
	    if (pkg != null) {  
	      String packagePath = pkg.getName().replace(".", File.separator);  
	      new File(packagePath).mkdirs();  
	    }*/
	    
		RealAction realAction=new RealAction();
		System.out.println("===Without Proxy===");
		//consumer(realAction);
		System.out.println("===Use Proxy===");
		//Action proxy=(Action) (new DynamicProxyHandler().bind(realAction));
		Action proxy=(Action) (new DynamicProxyHandler().bind(realAction));
		//Action proxy= (Action) Proxy.newProxyInstance(RealAction.class.getClassLoader(), RealAction.class.getInterfaces(), new DynamicProxyHandler(realAction));
		consumer(proxy);
		
		
		/**
		 * 参考：
		 * http://guojuanjun.blog.51cto.com/277646/1221281/
		 * 
		 * 
		 */
		byte[] proxyClass=ProxyGenerator.generateProxyClass(proxy.getClass().getSimpleName(), proxy.getClass().getInterfaces());
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("D:\\Proxy/$proxy000.class");
			fileOutputStream.write(proxyClass);
			fileOutputStream.flush();
			fileOutputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*System.out.println("$proxy----");
		System.out.println(proxy.getClass().getName());
		Class clz = proxy.getClass();
		printClassDefinition(clz);*/
		
	}
	
	/*public static String getModifier(int modifier){
		  String result = "";
		  
		  result= Modifier.toString(modifier);
		  return result;
		
		  String result = "";
		  switch(modifier){
		   case Modifier.PRIVATE:
		    result = "private";
		   case Modifier.PUBLIC:
		    result = "public";
		   case Modifier.PROTECTED:
		    result = "protected";
		   case Modifier.ABSTRACT :
		    result = "abstract";
		   case Modifier.FINAL :
		    result = "final";
		   case Modifier.NATIVE :
		    result = "native";
		   case Modifier.STATIC :
		    result = "static";
		   case Modifier.SYNCHRONIZED :
		    result = "synchronized";
		   case Modifier.STRICT  :
		    result = "strict";
		   case Modifier.TRANSIENT :
		    result = "transient";
		   case Modifier.VOLATILE :
		    result = "volatile";
		   case Modifier.INTERFACE :
		    result = "interface";
		  }
		  return result;
		 }
		 
		 public static void printClassDefinition(Class clz){
		 
		  String clzModifier = getModifier(clz.getModifiers());
		  if(clzModifier!=null && !clzModifier.equals("")){
		   clzModifier = clzModifier + " ";
		  }
		  String superClz = clz.getSuperclass().getName();
		  if(superClz!=null && !superClz.equals("")){
		   superClz = "extends " + superClz;
		  }
		 
		  Class[] interfaces = clz.getInterfaces();
		 
		  String inters = "";
		  for(int i=0; i<interfaces.length; i++){
		   if(i==0){
		    inters += "implements ";
		   }
		   inters += interfaces[i].getName();
		  }
		 
		  System.out.println(clzModifier +clz.getName()+" " + superClz +" " + inters );
		  System.out.println("{");
		 
		  Field[] fields = clz.getDeclaredFields();
		  for(int i=0; i<fields.length; i++){
		   String modifier = getModifier(fields[i].getModifiers());
		   if(modifier!=null && !modifier.equals("")){
		    modifier = modifier + " ";
		   }
		   String fieldName = fields[i].getName();
		   String fieldType = fields[i].getType().getName();
		   System.out.println("    "+modifier + fieldType + " "+ fieldName + ";");
		  }
		 
		  System.out.println();
		 
		  Method[] methods = clz.getDeclaredMethods();
		  for(int i=0; i<methods.length; i++){
		   Method method = methods[i];

		   String modifier = getModifier(method.getModifiers());
		   if(modifier!=null && !modifier.equals("")){
		    modifier = modifier + " ";
		   }
		  
		   String methodName = method.getName();
		  
		   Class returnClz = method.getReturnType();
		   String retrunType = returnClz.getName();
		  
		   Class[] clzs = method.getParameterTypes();
		   String paraList = "(";
		   for(int j=0; j<clzs.length; j++){
		    paraList += clzs[j].getName();
		    if(j != clzs.length -1 ){
		     paraList += ", ";
		    }
		   }
		   paraList += ")";
		  
		   clzs = method.getExceptionTypes();
		   String exceptions = "";
		   for(int j=0; j<clzs.length; j++){
		    if(j==0){
		     exceptions += "throws ";
		    }

		    exceptions += clzs[j].getName();
		   
		    if(j != clzs.length -1 ){
		     exceptions += ", ";
		    }
		   }
		  
		   exceptions += ";";
		  
		   String methodPrototype = modifier +retrunType+" "+methodName+paraList+exceptions;
		  
		   System.out.println("    "+methodPrototype );
		   
		  
		  }
		  System.out.println("}");
		 }*/

}
