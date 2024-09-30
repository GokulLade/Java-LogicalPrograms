package com.nit.logical.array.day02;

/*	Write the java Program to Read the array and print the array by making 
	the logic in specific method so that it have the clarity which logic 
	is for what purpose.
	Also it can provide the user to insert the user choice data and also 
	when user want to call the method. The method also can provide the 
	the functionality to accept the user input ?
*/
import java.util.Scanner;

public class ReadAndPrintArrayElementProgram01 {
	static Scanner scanner=new Scanner(System.in);
	
	public static void read(int element[]) 
	{
		for(int i=0;i<element.length;i++) {
			System.out.println("Enter the Element for ["+(i+1)+"] index");
			element[i]=scanner.nextInt();
		}
	}
	
	public static void print(int element[]) {
		for(int i=0;i<element.length;i++) {
			System.out.println("The Element present in ["+(i+1)+"] index is "+element[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("How many Array Element you want to add..!!");
		int size=scanner.nextInt();
		
		int element[]=new int[size];
		
		ReadAndPrintArrayElementProgram01.read(element);
		ReadAndPrintArrayElementProgram01.print(element);
		
	}

}
