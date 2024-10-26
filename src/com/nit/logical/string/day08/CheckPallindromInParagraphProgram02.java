package com.nit.logical.string.day08;


// Program to check how many pallindromes word present in the paragraph ?
import java.util.Scanner;

public class CheckPallindromInParagraphProgram02 {
	
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
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Paragraph..!!");
		String paragraph=sc.nextLine();
		
		String world[]=paragraph.split(" ");
		
		for(int i=0;i<world.length;i++)
		{
			if(checkPallindrom(world[i]))
			{
				System.out.println(world[i]+" ");
			}
				
		}
	
	}

}
