package com.nit.logical.array.day05;
/*
 Q4.Given an array of integers length 3, figure out which is larger element in that array and 
	return the largest element with the help of the method ?
*/
public class LargestElementProgram04 {
	
	public static int largeElement(int arr[]) {
		
		int big=arr[0];
		
		if(arr[1]>big) {
			big= arr[1];
		}
		
		if(arr[2]>big) {
			big=arr[2];
		}
		
		return big;
		
	}

	public static void main(String[] args) {
		
		int arr[]= {31,15,25};
		
		System.out.println(LargestElementProgram04.largeElement(arr));

	}

}
