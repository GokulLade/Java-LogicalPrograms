package com.nit.logical.array.day07;

/*
  The array is given to you 
      
   	for example: 
      int arr[]={1,2,3,4,5,6};
      
       > searching element user will give based on his/her
         choice
       
       > If THE element is present print at which index
         the element is available
       
       > if the element is not present then only give 
         the status as "element not found"
*/

import java.util.Scanner;

public class LinearSearchArrayProgram01 {
	
	public static void linearSearch(int[] arr, int searchElement) 
	{
		int flag=0;
		
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==searchElement) 
			{
				System.out.println("Element is found at Index : "+i);
				flag=1;
			}
		}
		
		if(flag==0) {
			System.out.println("Element is Not found in an array..!!");
		}
		
		
	}
	

	public static void main(String[] args) 
	{
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("How many Element you want to Store in array..!!");
		int size=scanner.nextInt();
		
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Element for index : "+(i+1));
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the Element which you want to search..!!");
		int searchElement=scanner.nextInt();
		
		LinearSearchArrayProgram01.linearSearch(arr,searchElement);
		
		scanner.close();
	}

}
