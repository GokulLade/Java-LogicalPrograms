package com.nit.logical.array.day01;

import java.util.Scanner;

/*	Write the java program to store the element inside
    the array where user can give the choice indexs/size
    and allow user to insert the userchoice elements 
    of integer type 
*/

public class FirstWayDeclarationArrayProgram03 {
	public static void main(String[] args) 
	{

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("How Many Element you want to add..!!");
		int size=scanner.nextInt();
		
		int element[]=new int[size];
		
		for(int i=0;i<element.length;i++) {
			System.out.println("Enter the Element for index "+(i+1));
			element[i]=scanner.nextInt();
		}
		
		for(int i=0;i<element.length;i++) {
			System.out.println("The Element prsent in index ["+(i+1)+"] is "+element[i]);
		}
		
		scanner.close();
		
	}

}
