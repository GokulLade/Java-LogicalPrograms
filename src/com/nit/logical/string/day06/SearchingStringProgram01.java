package com.nit.logical.string.day06;

import java.util.InputMismatchException;
import java.util.Scanner;

/*

Searching for char/substring
	1. public boolean contains(charSequence sc):
      ->As it is parameter having the charSequence 
        we can pass string ,stringBuffer as well as
        StringBuilder.
        
      ->Contains method will check from the starting from h in string 1 and check
		any character start from p if start it will again check with the next character
		of the word "program" if every character matched then it will return true
		otherwise it will return false.
		
	  ->Contain method is case sensitive if we compare the string which is small
		letter lets say String s="program" and if we compare with the capital letter
		"Program" it will return false. and there is no containIgnoreCase() present
		if we want to check then we can write the method known as toLowerCase()
		
	  ->We can't compare character by using compareTo because compareTo parameter is
		taking char sequence not the character.
		 
		we can pass character as a string format in the paramter of the compareTo
		method.
         
         
       |- public int indexOf(char ch)
       |- public int indexOf(String s)
       |- public int indexOf(char ch,int fromIndex)
       |- public int indexOf(String s,int fromIndex)
       
       |- public int lastIndexOf(char ch)
       |- public int lastIndexOf(String s)
       |- public int lastIndexOf(char ch,int fromIndex)
       |- public int lastIndexOf(String s,int fromIndex)
 */

// Programs on contains method

/*
       		URL pattern 
       _________________________
        protocol  host  url  name
        
        http:// localhost:8081//mystring
*/  
class Program03 {
	  public static String urlPattern="http://localhost:8081//myString";
	  
	    public String getUrl() 
	    {
	    	 return urlPattern;
	    }
	    
	    public void setUrl(String oldPortNo,String newPortNo)throws InputMismatchException 
	    {
	    	  if(urlPattern.contains(oldPortNo))
	    	  {
	    		   urlPattern="http://localhost:"+newPortNo+"//mystring";
	    	  }
	    	  else 
	    	  {
	    		   throw new InputMismatchException("port number not matched!!");
	    	  }
	    }

public class SearchingStringProgram01 {

	public static void main(String[] args)
	{
		Program03 p=new Program03();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Press 1 for changing the port no");
			System.out.println("Press 2 for seeing the url ");
			System.out.println("Press 3 for exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
		
			   if(choice==1) 
			   {
				    System.out.println("Enter the old portNo");
				    String oldPortNo=sc.next();
				    System.out.println("Enter the changing port No");
				    String newPortNo=sc.next();
				     try {
				    p.setUrl(oldPortNo, newPortNo);
				     }
				     catch(InputMismatchException e) {
				    	  System.err.println(e.getMessage());
				     }
				     catch(Exception e) {
				    	  System.err.println(e.getMessage());
				     }
				     
			   }
			   else if(choice==2)
			   {
				    
				   System.out.println(p.getUrl());
			   }
			   else if(choice==3)
			   {
				    System.out.println("Operation compeleted!!!!");
				    System.exit(0);
			   }
			   else
			   {
				    System.out.println("Invalid Input");
			   }
		   
		 }
		
	}
}
}
