package com.nit.logical.array.day05;

/*
Q1. Given an array of integers, return true if the array length is 1 or more,and the first element and the 
	last elements both are equal.
	
*/
public class CheckLengthProgram01 {

	public static boolean checkArray(int arr[]) 
	{
		int length=arr.length;
		if((arr.length>0) && (arr[0]==arr[arr.length-1])) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,1};
		
		boolean result=CheckLengthProgram01.checkArray(arr);
		
		System.out.println(result);
		
	}

}
