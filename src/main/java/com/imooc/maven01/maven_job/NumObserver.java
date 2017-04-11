package com.imooc.maven01.maven_job;

import java.util.Observable;
import java.util.Observer;

public class NumObserver implements Observer{
	public void update(Observable o,Object arg){
		NumObservable myObservable=(NumObservable) o;
		System.out.println("Data has changed to "+myObservable.getDate());
		
	}
	/*public void update(Observable o,Object arg){
		Observable myObservable=(NumObservable) o;
		System.out.println("Data has changed to "+myObservable);
		
	}*/
	

}
