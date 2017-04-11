package com.imooc.maven01.IOStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		byte[] buffer=new byte[512];
		int numberRead=0;
		FileInputStream input=null;
		FileOutputStream out=null;
		
		try {
			input=new FileInputStream("D://IOStudy//Pic//1.jpg");
			out=new FileOutputStream("D://IOStudy//Pic//2.jpg");
			
			while((numberRead=input.read(buffer))!=-1){
				out.write(buffer, 0, numberRead);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				input.close();
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

}
