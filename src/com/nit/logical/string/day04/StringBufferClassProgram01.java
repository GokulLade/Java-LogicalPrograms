package com.nit.logical.string.day04;

/*
 
Q1. What is Mutable class?

	Mutable class objects are those which can be modified after initialization. 
   	This means the values of their fields can be changed,
   	Examples of mutable objects are Java’s StringBuilder, StringBuffer, & java.util.Date.

	In mutable objects, changes to the object’s state (data members) do not 
	result in the creation of a new object. Instead, the existing object’s values  
	are modified through functions provided by the object’s class, such as setters. 
	Mutable objects have both getters and setters functions.
	
Q2. Where to use and when to use String ,StringBuffer,StringBuilder?

|- String 
   ___________
    When multiple object also creation not effect the performance of application 
    and when we need previous data as well as the modified data and also we need 
    Thread safety then we will go for the String 

|- StringBuffer
   _____________ 	
   When we don't need multiple object creation as well as I need to perform operations
   in the multithreaded environment then we will go for StringBuffer.

|- StringBuilder
   _____________
   When we don't need multiple object creation as well as I need to perform operations
   in the single threaded environment then we will go for StringBuilder.
   
   ->StringBuffer all the methods are synchronized and StringBuilder all the methods
	 are unsynchronized

   
 */

// Sample program on StringBuffer Class

public class StringBufferClassProgram01 {

	public static void main(String[] args) 
	{
//		StringBuffer sb1="Gokul"; //Error
		
		StringBuffer sb1=new StringBuffer("Gokul");
		
		StringBuffer sb2=sb1.append(" Lade");
		
		System.out.println(sb1);
		
		System.out.println(sb2.capacity());
	}

}
