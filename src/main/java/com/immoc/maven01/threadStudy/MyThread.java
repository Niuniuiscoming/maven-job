package com.immoc.maven01.threadStudy;

public class MyThread implements Runnable{
	private int count=5;
	public String name;
	
	public MyThread(){
		
	}
	public MyThread(String name){
		this.name=name;
	}
	public void run(){
		synchronized (this) {
			while(count>=0){
				System.out.println("Thread "+Thread.currentThread().getName()+" "+count--);
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		/*MyThread t1=new MyThread("t1");
		MyThread t2=new MyThread("t2");
		t1.start();
		t2.start();*/
		Runnable r1=new MyThread();
		Thread t1=new Thread(r1,"t1");
		Thread t2=new Thread(r1,"t2");
		t1.start();
		t2.start();
	}

}
