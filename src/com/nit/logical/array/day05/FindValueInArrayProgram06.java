package com.nit.logical.array.day05;

/*
 Q6. Given an array of integers, return true if 15 appears as either the first or last element in the array.
   	 The array will be length 1 or more.
*/

public class FindValueInArrayProgram06 {
	
	public static boolean returnResult(int arr[]) {
		if((arr.length>0) && (arr[0]==15 || arr[arr.length-1]==15)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[]= {11,44,15};
		
		System.out.println(FindValueInArrayProgram06.returnResult(arr));
		
	}

}
