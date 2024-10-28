package com.nit.logical.string.day08;

public class CheckAlphaNumberSpecialInStringProgram07 
{

	public static void main(String[] args) 
	{
		int alphabets=0,number=0,specialChar=0;
		
		String str="gokullade89@gmail.com";
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isAlphabetic(ch[i])) {  alphabets++;  }
			
			else if(Character.isDigit(ch[i])) {  number++;  }
			
			else {  specialChar++;  }
		}
		
		System.out.println("The Alphabets are present in string is : "+alphabets);
		System.out.println("The Number are present in string is : "+number);
		System.out.println("The Special Character are present in string is : "+specialChar);

	}

}
