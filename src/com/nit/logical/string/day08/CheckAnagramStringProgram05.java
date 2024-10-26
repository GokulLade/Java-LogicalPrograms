package com.nit.logical.string.day08;

// Check the string is anagram of or not ?
public class CheckAnagramStringProgram05 {

	public static void main(String[] args) 
	{
		String str1="listen";
		String str2="silent";
		
		str1=SortStringProgram04.sortString(str1);
		str2=SortStringProgram04.sortString(str2);
		
		if(str1.equals(str2))
		{
			System.out.println("String are Anagram");
		}
		else
		{
			System.out.println("String are Not Anagram");
		}

	}

}
