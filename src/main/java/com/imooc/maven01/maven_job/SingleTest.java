package com.imooc.maven01.maven_job;

public class SingleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumObservable number=new NumObservable();
		Num2Observable number2=new Num2Observable();
		
		//Num2Observer muNum2Observer=new Num2Observer();
		
		number.addObserver(new NumObserver());
		number2.addObserver(new Num2Observer());
		
		number.setData(1);
		number2.setData(3);
		number.setData(2);
	}

}
