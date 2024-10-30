package com.nit.logical.array.day09;

import java.util.Arrays;

//Copy one array into another array
public class CopyArrayProgram01 {
	
	public static int[] copyArrayElements(int arr[])
	{
		int copyArray[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			copyArray[i]=arr[i];
		}
		
		return copyArray;
		
	}

	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		
		//Using our Logic
		System.out.println(Arrays.toString(copyArrayElements(arr)));
		
		//Using pre-defined class
		int copyArray[]=Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(copyArray));

	}

}
