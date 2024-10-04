package com.nit.logical.array.day07;

//By using Pre-Define method of Arrays
import java.util.Arrays;

public class PreDefinemethodForSearchElementInArrayProgram03 {

	public static void main(String[] args) 
	{
		int arr[]= {2,33,4,22,67,89};
		
		int searchElement=22;
		
		Arrays.sort(arr);
		
		int index=Arrays.binarySearch(arr, searchElement);
		
		if(index>=0) {
			System.out.println("Element is found at index :"+index);
		}
		else {
			System.out.println("Element is Not Found In Array");
		}

	}

}
