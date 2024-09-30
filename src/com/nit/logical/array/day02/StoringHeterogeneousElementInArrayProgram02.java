package com.nit.logical.array.day02;

import java.util.Arrays;
import java.util.Scanner;

public class StoringHeterogeneousElementInArrayProgram02 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Object obj[]=new Object[4];
		
		System.out.println("Enter your Name : ");
		obj[0]=scanner.next();
		
		System.out.println("Enter your Age : ");
		obj[1]=scanner.nextInt();
		
		System.out.println("Enter your 12 Mark : ");
		obj[2]=scanner.nextDouble();
		
		System.out.println("Enter your Class Division : ");
		obj[3]=scanner.next().charAt(0);
		
		System.out.println("Your Details Are : ");
		System.out.println(Arrays.toString(obj));
		
		scanner.close();
	}

}
