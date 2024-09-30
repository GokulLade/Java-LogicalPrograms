package com.nit.logical.array.day04;
/*
Q1. Write a Java program that takes input for an array of integers and performs the following calculations on the array elements:

	Calculate the sum of all the elements in the array.
	Calculate the result of subtracting each element from the initial element (at index 0) successively.
	Calculate the result of multiplying each element with the initial element (at index 0) successively.
	
	Define a function named Calculation which takes an integer array as input and returns an integer array
	containing the results of the three calculations mentioned above. In the main function, 
	take input for the size of the array and its elements, call the Calculation function, and print the resulting array.
	
*/
public class AssignmentProgram04 {
	
	public static int[] calculation(int arr[]) 
	{
		int sum=arr[0],sub=arr[0],mul=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			sum+=arr[i];
			sub-=arr[i];
			mul*=arr[i];
		}
		
		int result []= new int[] {sum,sub,mul};
		
		return result;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		int arr2[]=AssignmentProgram04.calculation(arr);
		
		System.out.println("The Sum is "+arr2[0]);
		System.out.println("The subtraction is "+arr2[1]);
		System.out.println("The Multiplication is "+arr2[2]);
		
		

	}

}
