package com.imooc.maven01.IOStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.imageio.stream.FileImageInputStream;

public class ObjetStream {

	public static void main(String[] args) {
		ObjectOutputStream objectwriter=null;
		ObjectInputStream objectreader=null;
		
		try {
			objectwriter=new ObjectOutputStream(new FileOutputStream("D://IOStudy//IO//student.txt"));
			objectwriter.writeObject(new Student("gg",22));
			objectwriter.writeObject(new Student("tt",29));
			objectwriter.writeObject(new Student("rr",17));
			objectreader=new ObjectInputStream(new FileInputStream("D://IOStudy//IO//student.txt"));
			
			for(int i=0;i<3;i++){
				System.out.println(objectreader.readObject());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
