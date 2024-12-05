package com.nit.logical.array.day05;

/*
 Q3. Given an array of integers length 3, return an array with the elements 
	 "rotated left" so {1, 2, 3} will become  {2, 3, 1}. 
 */
import java.util.Arrays;

public class ReturnArrayRotatedProgram03 {
	
	public static int[] returnArray(int arr[])
	{
		
		int tem=arr[0];
		arr[0]=arr[1];
		arr[1]=arr[2];
		arr[2]=tem;
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		
		System.out.println(Arrays.toString(ReturnArrayRotatedProgram03.returnArray(arr)));
		
		
	}

}
