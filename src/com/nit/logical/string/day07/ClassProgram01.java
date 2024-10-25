package com.nit.logical.string.day07;

/*  
    Program to read a string from the user   
    and find whether the string has   
    a substring "everyone" or not   
    if it is there display the character "everyone"  
    in the case it present in the user passing  
    string   
      
    InPUT as : everyone   
    Output as : everyone word is present  
      
    Input as :EveryOne   
    Output as : EveryOne word is present  
      
    Input as : Hello  
    Output as : Everyone word is not present  
    
 */

/*Program which is the combination of contains() , length() , toLowerCase(),
 substring(), indexof() */
import java.security.PublicKey;
import java.util.Scanner;

public class ClassProgram01 {
	

	static String word=null;
	public static void main(String[] args) 
	{
		String str1="everyone";
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Paragraph..!!");
		String paragraph = scanner.nextLine();
		
		String copyContain= paragraph.toLowerCase(); //Hello EveryOne
		
		int start=copyContain.indexOf(str1); 
		int end=start+str1.length();
		
		word=paragraph.substring(start,end);	
		
		checkString(copyContain, str1);

	}
	
	public static void checkString(String str1, String str2 ) 
	{
		if(str1.contains(str2)) 
		{
			System.out.println(word+" Word is present");
		}
		else 
		{
			System.out.println(word+" Word is not present");
		}
		
	}

}
