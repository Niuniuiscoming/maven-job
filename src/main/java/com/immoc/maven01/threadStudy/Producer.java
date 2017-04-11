package com.immoc.maven01.threadStudy;

public class Producer implements Runnable {
	private Info info=null;
	public Producer() {
		// TODO Auto-generated constructor stub
	} 
	public Producer(Info info){
		this.info=info;
	}

	public void run() {
		boolean flag=false;
		for(int i=0;i<25;++i){
			if(flag){
				this.info.setName("Roolen");
				this.info.setAge(20);
				flag=false;
			}else{
				this.info.setName("chunGe");
				this.info.setAge(100);
				flag=true;
				
			}
		}
	}

}
