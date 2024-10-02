package com.nit.logical.array.day06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// Sorting the array with the pre define present in the arrays class
public class UsingPre_DefinedMethodSortingProgram04 {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("How Many Element You want to Insert in array...");
		int size=scanner.nextInt();
		
		Integer arr[]=new Integer[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Element for index : "+(i+1));
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("Array Elements are : ");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		System.out.println("Sorted Array Elements in Ascending Order are : ");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		System.out.println("Sorted Array Elements in Descending Order are : ");
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		System.out.println();
		

	}

}
