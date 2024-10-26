package com.nit.logical.string.day08;

// Program to checking the String is pallindrome or not ?
public class CheckPallindromeProgram01 {
	
	public static boolean checkPallindrom(String str)
	{
		for(int i=0;i<str.length();i++) 
		{
			if(str.toLowerCase().charAt(i)!=str.toLowerCase().charAt(str.length()-i-1))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		String str ="radam";
		
		if(checkPallindrom(str))
		{
			System.out.println(str+" is Pallindrom String");
		}
		else
		{
			System.out.println(str+" is Not Pallindrom String");
		}

	}

}
