package com.imooc.maven01.maven_job;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyHandler implements InvocationHandler {
	private Object proxied;
	
	static{
		System.out.println("Handler");
		
	}
	
	public DynamicProxyHandler() {
	}
	
	public DynamicProxyHandler(RealAction realAction) {
		this.proxied=realAction;
	}

	

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("**** proxy: ****\n"+proxy.getClass()+
				"\nmethod:"+method+"\nargs:"+args);
		if(args != null)
			for(Object arg :args)
				System.out.println(" "+arg);
			
		
		return method.invoke(proxied, args);
	}

	public Object bind(RealAction realAction) {
		this.proxied=realAction;
		return Proxy.newProxyInstance(realAction.getClass().getClassLoader(), realAction.getClass().getInterfaces(),this);
	}

}
