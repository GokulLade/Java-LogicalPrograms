package com.nit.logical.array.day01;
import java.util.Arrays;
import java.util.Scanner;
/*
 *Q1. What is the drawback of variables?
 *    |- Proof
 *  
 *    One PERSON try to add the money in it's account 
 *    in the bank 
 *    |- You have to ask to enter the money as per 
 *        user choice
 *    |- Ask the user that he/she want to add the money 
 *       or not 
 *       if yes allow to add the money 
 *       if no print the mini statement
 *   
 */


//Program to show the drawback of variable and for the above requirement

public class WhyArrayProgram01 {

	public static void main(String[] args) {
//		int balance=0;
//		int totalBalance=0;
//		String choice;
		Scanner sc =new Scanner(System.in);
//		
//		do {
//			System.out.println("Enter the amount for deposit");
//			balance=sc.nextInt();
//			totalBalance+=balance;
//			
//			System.out.println("Do you want to continue..!!");
//			System.out.println("Enter Yes or NO");
//			choice=sc.next();
//			
//		}while(choice.equalsIgnoreCase("Yes"));
//		
//		System.out.println("The total balance is "+totalBalance);
//		System.out.println("The money added by you is "+balance);
//	
		
		ArrayUse.bank(sc);
	}
}

/*
	Drawback of the variable is we can store only one value at a time 
	for the above program drawback we are going to use array  concept
	so that inside the array we can store multiple value 

*/

// Same Above requirement by the use of the array concept
class ArrayUse{
	public static void bank(Scanner sc) {
		int balance[]=new int[3];
		int totalBalance=0;
		String choice;
		int index=0;
		
		do {
			System.out.println("Enter the amount..!!");
			balance[index]=sc.nextInt();
			totalBalance+=balance[index];
			index++;
			System.out.println("Do you want to continue..!!");
			System.out.println("Enter Yes or No");
			choice=sc.next();
			
		}while(choice.equalsIgnoreCase("Yes"));
		
		System.out.println("The total balance is "+totalBalance);
		System.out.println("The money added by you is "+ Arrays.toString(balance));
	}
}




