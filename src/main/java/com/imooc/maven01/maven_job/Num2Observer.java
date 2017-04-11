package com.imooc.maven01.maven_job;

import java.util.Observable;
import java.util.Observer;

public class Num2Observer implements Observer {

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Num2Observable myObservable=(Num2Observable) o;
		System.out.println("数据已经改变 "+myObservable.getDate());

	}

}
