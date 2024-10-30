package com.nit.logical.array.day09;

import java.util.Arrays;
import java.util.Scanner;

//User want to insert few element in the same array by increasing the size of the array 
public class CopyExtraElementsProgram02 {
	
		static Scanner sc=new Scanner(System.in);
		
		public static void mycopy(int [] arr,int index) 
		{
			
			  
		// Our own created logic for the requirement
			
			int []arr1=new int[arr.length+index];  
			System.out.println(Arrays.toString(arr1));
			 
			 for(int i=0;i<arr.length;i++) 
			 {
				  arr1[i]=arr[i];
			 }
			 System.out.println(Arrays.toString(arr1));	
			 
			 for(int i=arr.length-index;i<arr1.length;i++) 
			 {
				  System.out.println("Enter the element of your choice");
				  arr1[i]=sc.nextInt();
			 }
			 System.out.println(Arrays.toString(arr1));
		}

	public static void main(String[] args) 
	{
		System.out.println("Enter how many index you need");
		int index=sc.nextInt();// 3
		int [] arr= {1,2,3,4,5,6,7};
		mycopy(arr, index);

	}

}
