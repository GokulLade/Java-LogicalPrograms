package com.nit.logical.string.stringinterviewquestion;

/*  
 
Q1. How to execute the logic of some other class which is 
    present in the different package and you are trying to
 	access in the different packager without creating the object 
 	or without writing the class?

	|- By using Class.forName("Fully Qualified Name")
	  |- Fully Qualified Name
	     |- package name and class name 
	  |- It will load class at runtime without creating the object of the class
*/

//Program :
public class LogicalProgarm01 {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.nit.logical.string.day09.Logical");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
