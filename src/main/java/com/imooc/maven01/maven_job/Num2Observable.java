package com.imooc.maven01.maven_job;

import java.util.Observable;

public class Num2Observable extends Observable{
	private int data = 0;
	
	public int getDate(){
		return data;
	}
	
	public void setData(int i) {
		data = i;
		setChanged();
		notifyObservers();
	}

}
