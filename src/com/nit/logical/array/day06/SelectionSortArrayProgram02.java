package com.nit.logical.array.day06;

import java.util.Arrays;
import java.util.Scanner;

/*
 Sorting the array with the user-define logic:
 
 Sort the number 
     |- read the element in the array 
        int [] arr={1,2,3,4,5};
        int [] arr01=new int[5];         
             
      |- hold the element and check with alternate ele
      |- hold the element and check with itself
*/

// SORTING THE LOGIC BY HOLDING THE ELEMENT AND CHECKING WITH THE ALTERNATE ELEMENT(means j with start from i+1)
public class SelectionSortArrayProgram02 {
	
	public static int[] ascendingOrderSort(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) 
			{ 
				if(arr[i]>arr[j]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		return arr;
	}
	
	public static int[] descendingOrderSort(int arr[]) {
			
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) 
				{ 
					if(arr[i]<arr[j]) {
						arr[i]=arr[i]+arr[j];
						arr[j]=arr[i]-arr[j];
						arr[i]=arr[i]-arr[j];
					}
				}
			}
			return arr;
		}

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("How Many Element You want to Insert in array...");
		int size=scanner.nextInt();
		
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Element for index : "+(i+1));
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("Array Elements are : ");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		System.out.println("Sorted Array Elements in Ascending Order are : ");
		System.out.println(Arrays.toString(SelectionSortArrayProgram02.ascendingOrderSort(arr)));
		System.out.println();
		
		System.out.println("Sorted Array Elements in Descending Order are : ");
		System.out.println(Arrays.toString(SelectionSortArrayProgram02.descendingOrderSort(arr)));
		System.out.println();
		
		
	}

}
