package com.nit.logical.string.stringinterviewquestion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentDetailsSerialization {

	public static void main(String[] args) throws IOException 
	{
		StudentDetails student =new StudentDetails(101, "Gokul", "Deogiri College");
		
		try {
			FileOutputStream fos=new FileOutputStream("objectData.txt");
			
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(student);
			
			System.out.println("Object Data is Stored in File..!!");
		} 
		catch (IOException  e) {
			e.printStackTrace();
		}
		
	}

}
