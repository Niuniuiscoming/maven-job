package callbackTest;

/**
 * 
 * @author Administrator
 *	http://blog.csdn.net/xiaanming/article/details/8703708/
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/** 
         * new 一个小李 
         */  
        Li li = new Li();  
  
        /** 
         * new 一个小王 
         */  
        Wang wang = new Wang(li);  
          
        /** 
         * 小王问小李问题 
         */  
        wang.askQuestion("1 + 1 = ?"); 
	}

}
