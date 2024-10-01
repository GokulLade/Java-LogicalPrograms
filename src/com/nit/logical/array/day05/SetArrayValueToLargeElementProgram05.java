package com.nit.logical.array.day05;

import java.util.Arrays;

/*
 Q5.Given an array of integers length 3, figure out which is larger, the first or last element in the array,
	and set all the other elements to be that value. Return the changed array.
*/
public class SetArrayValueToLargeElementProgram05 {

	public static int[] returnLarge(int arr[]) 
	{
		int max=0;
		
		if(arr[0]>arr[arr.length-1]) {
			max=arr[0];
		}
		else {
			max=arr[arr.length-1];
		}
		
		int arr1[]=new int[] {max,max,max};
		
		return arr1;
		
		
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {22,34,44};
		
		System.out.println(Arrays.toString(SetArrayValueToLargeElementProgram05.returnLarge(arr)));

	}

}
