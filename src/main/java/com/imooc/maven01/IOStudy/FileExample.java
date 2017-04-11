package com.imooc.maven01.IOStudy;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class FileExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createFile();
	}
	
	public  static void  createFile(){
		File f=new File("D:\\IOStudy/IO/IO.txt");
			try {
				if(!f.exists()){
				new File(f.getParent()).mkdirs();
				f.createNewFile();
				System.out.println("新建成功");
				}
				else{
				System.out.println("文件父目录字符串 "+f.getParent());
				System.out.println("space分区大小："+f.getTotalSpace()/(1024*1024*1024)+"G");
				System.out.println("文件父目录字符串 "+f.getParent());
				
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
