package com.nit.logical.string.day04;

/*

Most asked String interview mock Questions
--------------------------------------------

Q1. Diff between length and length()
Q2. Diff between immutable and mutable
Q3. Why immutable why mutable 
Q4. Who are immutable who are mutable 
Q5. Diff between string ,StringBuffer ,StringBuilder
Q6. when to go for string ,StringBuffer,StringBuilder

*/

// Sample program on StringBuilder class

public class StringBuilderClassProgram03 {

	public static void main(String[] args)
	{
//		StringBuilder sb="Gokul"; //Error
		
		StringBuilder sb1=new StringBuilder("Gokul");
		
		System.out.println(sb1); //Gokul
		
		StringBuilder sb2=sb1.append(" Lade");
		System.out.println(sb1);
		System.out.println(sb2);
	}

}