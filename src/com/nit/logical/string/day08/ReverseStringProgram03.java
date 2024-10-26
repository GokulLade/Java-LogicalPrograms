package com.nit.logical.string.day08;

import java.util.Arrays;
import java.util.Scanner;

// Reverse the String
public class ReverseStringProgram03 {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Paragraph..!!");
		String para=sc.nextLine();
		
		String word[] =para.split(" ");
		
		StringBuffer reverse = new StringBuffer();
		
		for(int i=word.length-1;i>=0;i--)
		{
			reverse=reverse.append(word[i]+" ");
		}
		
		System.out.println(reverse);
		
	}

}
