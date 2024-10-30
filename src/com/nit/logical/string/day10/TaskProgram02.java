package com.nit.logical.string.day10;

import java.util.Scanner;

/*
 
Q1. Write a Java program that removes all occurrences of a specified character from a given string without using 
    any predefined methods from the String class (such as replace(), replaceAll(), etc.). 
	
	The program should:
	Take a string as input, such as "Hello everyone".
	Define a character to remove, for example 'e'.
	Output the original string and the modified string, which excludes all instances of the specified character.
	
	Example:
	Input:
	String: "Hello everyone"
	Character to remove: 'e'
	
	Expected Output:
	Original String: "Hello everyone"
	Modified String: "Hllo vryon"
	 
*/
public class TaskProgram02 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String..!!");
		String str=sc.nextLine();
		
		System.out.println("Enter the character which you want to delete from string..!!");
		char ch=sc.next().charAt(0);
		
		char ch1[]=str.toCharArray();
		char ch2[]=new char[str.length()];
		
		for(int i=0,a=0;i<ch1.length;i++,a++)
		{
			if(ch1[i]==ch)
			{
				a--;
				continue;
			}
			
			ch2[a]=ch1[i];
		}
		
		String result1=new String(ch1);
		String result2=new String(ch2);
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
