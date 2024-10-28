package com.nit.logical.string.day08;


import java.util.Scanner;

/*
 Password creation validation logic
 -> Check password length must be greater than or equal to eight(8) --> Completed
 -> Check password is not contain any space --> Completed
 -> Check password is contain one upper-case letter --> Completed
 -> Check password is contain one lower-case letter --> Completed
 -> Check password is contain one digit --> Completed
 -> Check password is contain one special character	-->
*/

public class PasswordCreationValidationProgram08 {
	
	// Create the Scanner Class Object
	static Scanner sc =new Scanner(System.in);
	
	//Create Method for get password from user
	public static String getPassword(int count)
	{
		if(count>0)
		{
			System.out.println("Please Enter the Password again..!!");
		}
		else 
		{
			System.out.println("Please Enter the Password..!!");
		}
				
		return sc.nextLine();
	}
	
	//Method for check the password Condition
	public static boolean checkPassword(String str)
	{
		int upperCase=0,lowerCase=0,digit=0,specialChar=0;
		char ch[]=str.toCharArray();
		
		if(ch.length>=8)
		{
			for(int i=0;i<ch.length;i++) 
			{
				if(ch[i]==' ')
				{
					System.out.println("Password should not contain the space..!!");
					return false;
				}
				
				else if(Character.isAlphabetic(ch[i]))
				{
					if(ch[i]>='A' && ch[i]<='Z')
					{
						upperCase++;
					}
					else 
					{
						lowerCase++;
					}
				}
				else if(Character.isDigit(ch[i]))
				{
					digit++;
				}
				else {
					specialChar++;
				}
			
			}
			if(upperCase==0)
			{
				System.out.println("Password Must contain one uppercase letter..!");
				return false;
			}
			else if(lowerCase==0)
			{
				System.out.println("Password Must contain one lowercase letter..!");
				return false;
			}
			else if(digit==0)
			{
				System.out.println("Password Must contain one digit..!");
				return false;
			}
			else if(specialChar==0)
			{
				System.out.println("Password Must contain one special character..!");
				return false;
			}
			
		}
		
		else
		{
			System.out.println("The Password length Must be greater than Eight character..!!");
			return false;
		}
		
		return true;
	}

	
	public static void main(String[] args) 
	{
		String password=null;
		int count=0;
		
		while(true)
		{
			password=getPassword(count);
			
			if(checkPassword(password))
			{
				System.out.println("Password is created..!!");
				break;
			}
			else {
				count++;
			}
		}
	}

}
