package com.nit.logical.string.day01;

/*

1. Equals():

-> Comparing the content 
	
-> Hash-code for comparing the content


2. == (operator)
 
-> Compare the reference ( compare the object )


*/

//Sample program
public class EqualsMethodProgram02 {

	public static void main(String[] args)
	{
		String s1="Gokul";
		String s2="Ganesh";
		String s3=new String("Gokul");
		String s4="Gokul";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1==s3);
		System.out.println(s1==s4);

	}

}
