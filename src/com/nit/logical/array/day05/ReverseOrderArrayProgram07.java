package com.nit.logical.array.day05;

import java.util.Arrays;

/*
  Q7.Given an array of integers length 3, return a new array with the elements in reverse order,
	 so {1, 2, 3} becomes {3, 2, 1}.
 */
public class ReverseOrderArrayProgram07 {
	
	public static int[] reverseArray(int arr[]) 
	{
		int temp=arr[0];
		arr[0]=arr[2];
		arr[2]=temp;
		
		return arr;
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		
		System.out.println(Arrays.toString(ReverseOrderArrayProgram07.reverseArray(arr)));

	}

}
