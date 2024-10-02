package com.nit.logical.array.day06;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  Bubble sort:
 * 
 *  
 *  |- The number will sort in the number of rounds
 *     rounds will be decided
 *      |- [element-1]
 *      
 *  |-At the time of sorting it will hold the index 
 *    and start checking by itself 
 *     |- if the 1st element is greater than the alternate element
 *        at once swap and this will sort the number in ace order
 *        
 *  |- Always the searching start from the index 0 or 0 position
 *  
 *  |- it will start with 0 check with alternate and the searching
 *     will inc and start with again the alternate
 *     
 *  |- At the last the element will be sorted in ace order 
 *  
 *  
 *  Ex: 33,18,25,11,8
 *  
 *  Round-I                           Round-II
 *  _________________                ___________________
 *  33 , 18, 25, 11, 8               18   25  11  8  33
 *  18   33  25  11  8               18   25  11  8  33
 *  18   25  33  11  8               18   11  25  8  33
 *  18   25  11  33  8               18   11  8  25  33
 *  18   25  11  8  33               18   11  8  25  33
 *  
 *  
 *  Round-III                         Round-IV
 *  _________________               _____________________
 *  18   11  8  25  33              11   8  18  25  33
 *  11   18  8  25  33              8   11  18  25  33
 *  11   8  18  25  33              8   11  18  25  33
 *  11   8  18  25  33              8   11  18  25  33
 *  11   8  18  25  33              8   11  18  25  33
 *  
 *  
 */

public class BubbleSortingProgram03 {
	
	public static int[] ascendingOrderSort(int arr[]) 
	{
		
		for(int i=0;i<arr.length;i++) {
			int flag=0;
			
			//arr.length-1 for getting rid from ArrayIndexOutOfBound
            //arr.length-1-i  for getting rid from extra repeated lines while sorting
			for(int j=0;j>arr.length-1-i;j++) 
			{
				if(arr[j]<arr[j+1]) 
				{
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
					flag=1;
				}
			}
			
			if(flag==1) 
			{
				break;
			}
		}
		
		return arr;
		
	}
	
	public static int[] descendingOrderSort(int arr[]) 
	{
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
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
