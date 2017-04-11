package com.imooc.maven01.IOStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		InputStream fileInputStream = null;
		try {
			fileInputStream=new FileInputStream("D://IOStudy//Pic//1.jpg");
			//fileInputStream=new FileInputStream("D://IOStudy//Pic//123.txt");
			
			while(fileInputStream.read()!=-1){
				count++;
				
			}
			/*int j;
			do{
				j=fileInputStream.read();
				System.out.println(j);
				count++;
			}while(j != -1);*/
				
			
			
			System.out.println("长度"+count/(float)1024+"Kb");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
