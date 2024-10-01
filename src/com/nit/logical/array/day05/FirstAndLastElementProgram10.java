package com.nit.logical.array.day05;

import java.util.Arrays;

/*
 	Q10. Given an array of integers, return a new array length 2 containing the first and
		 last elements from the original array. The original array will be length 1 or more
*/
public class FirstAndLastElementProgram10 {
	
	public static int[] returnElement(int arr[]){
		
		return new int[] {arr[0],arr[arr.length-1]};
	}

	public static void main(String[] args) 
	{
		int arr[]= {44,23,78,50};
		
		System.out.println(Arrays.toString(FirstAndLastElementProgram10.returnElement(arr)));

	}

}
