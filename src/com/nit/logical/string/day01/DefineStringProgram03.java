package com.nit.logical.string.day01;

/*
 
Q1. In how many way we can store the characters ?

Q2. In which case we will go for storing the character 
	in diff manner?
	   
Q3. What is diff between string and String?
    
    ->IF we write sequence of character in "" then it is known as string 
	  and String is the predefine class which is present in the package 
      java.lang and it's a immutable class.

Q4. In how many way we can create the string ?
    
    -> We can create the String in 2 way 
          a. By using string literals
          b. By creating the String class object and store by using constructor
             
*/   
public class DefineStringProgram03 {
	
	public static void main(String[] args) 
	{
		// Drawback of variables are it can store only one value at a time
		char ch1='a';
		char ch2='n';
		char ch3='t';
		System.out.println(ch1+ch2+ch3);
		
		// Drawback of array are fixed in size as well as method not supported
		char [] arr= {'a','n','t'};
		for(char value: arr) 
		{	   
		 System.out.print(value-32+" ");   
		}
		 
		
		//Solution is String: 
		String s="abc";
		String s1=new String("Abc");
		StringBuilder SB=new StringBuilder("abc");
		StringBuffer sb2=new StringBuffer("abc");
		  
		  
	}

}
