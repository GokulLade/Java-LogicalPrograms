package com.nit.logical.array.day05;

import java.util.Arrays;

/*
 Q9. Given 2 integer arrays, a and b, each length is 3, return a new array length 2
	 containing their middle elements.
*/
public class FindMiddleElementProgram09 {
	
	public static int[] returnMiddle(int arr1[], int arr2[]) {
		
		return new int[] {(arr1[arr1.length/2]),(arr2[arr2.length/2])};
	}

	public static void main(String[] args) {
		
		int a[]= {5,3,7};
		int b[]= {67,44,10};
		
		System.out.println(Arrays.toString(FindMiddleElementProgram09.returnMiddle(a, b)));

	}

}
