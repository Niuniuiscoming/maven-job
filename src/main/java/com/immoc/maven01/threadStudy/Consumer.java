package com.immoc.maven01.threadStudy;

public class Consumer implements Runnable {
	private Info info=null;
	public Consumer(){
		
	}
	public Consumer(Info info){
		this.info=info;
	}
	public void run() {
		for(int i=0;i<25;++i){
			System.out.println(this.info.getName()+"<----->"+this.info.getAge());
		}
	}

}
