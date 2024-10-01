package com.nit.logical.array.day05;

import java.util.Arrays;

/*
  Q8. Given an array of integers, return the sum of the first 2 elements in the array.
	 If the array length is less than 2, just sum up the elements that exist,
	 return 0 if the array is having length 0.
*/
public class SumFirstTwoElementProgram08 {
	
	public static int returnSum(int arr[]) {
		if(arr.length<=0) {
			return 0;
		}
		
		return arr[0]+arr[1];
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3};
		
		System.out.println(SumFirstTwoElementProgram08.returnSum(arr));

	}

}
