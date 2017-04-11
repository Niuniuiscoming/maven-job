package instanceofTest;

import sun.misc.IoTrace;

public class MultiStateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
             test();
     }

     public static void test(){
             IObject f=new Test();
             if(f instanceof java.lang.Object)System.out.println("true1");
             if(f instanceof Foo)System.out.println("true2");
             if(f instanceof Test)System.out.println("true3");
             if(f instanceof IObject)System.out.println("true4");
             
             IObject f2=new Foo();
             if(f2 instanceof Test)System.out.println("true5");
             
     } 

}
	 interface IObject {
	}

	 class Foo implements IObject{
	}

	 class Test extends Foo{
	} 