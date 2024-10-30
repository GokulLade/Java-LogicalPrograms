package com.nit.logical.string.day10;

import java.util.Scanner;

/*
  
 Que-1:
	__________________
	Write the java code to remove the white spaces form the string 
	without using any pre-define method as trim() as well as every starting 
	letter will be in capital while printing the output?
	
	Input as :"hello everyone we are done with the all the pre define method in string"
	output as:"HelloEveryoneWeAreDoneWithTheAllThePredefineMethodInString"
  
*/
public class TaskProgram01 {

	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String..!!");
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		char result[]= new char[str.length()];
		
		for(int i=0,a=0 ;i<ch.length;i++,a++)
		{
			if(ch[i]==' ') 
			{
				ch[i+1]=(char)(ch[i+1]-32);
				a--;
				continue;
			}
			
			result[a]=ch[i];
		}
		
		String result1=new String(result);
		
		System.out.println(result1);
		
	}

}
