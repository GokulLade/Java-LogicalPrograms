package com.nit.logical.string.stringinterviewquestion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDetailsDeserialization {

	public static void main(String[] args)
	{
		
		try {
			FileInputStream fis=new FileInputStream("objectData.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			StudentDetails student= (StudentDetails)ois.readObject(); 
			System.out.println(student);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
