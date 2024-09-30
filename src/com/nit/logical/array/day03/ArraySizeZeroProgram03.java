package com.nit.logical.array.day03;

/*
  Q1. Can we create Array size as zero?
		Sample Code
        int [] arr=new int[0];
         
   Solution:-  Yes, you can create an array with a size of zero in Java.
               Declaring an array with a size of zero doesn't allocate any memory for elements
               within the array, although it will act as empty array. This can be useful in some
               situations where you might later dynamically allocate memory for the array based on 
               some conditions.
               
   Note:- You can take the example of public static void main(String [] args)
          where if you print the length of the args when you don't pass value through
          command prompt,then as a result we will get length as a zero 
          
  Q2. Can we create the array size as negative?

    Solution:- we can write there will be no compile time error but at the Runtime 
               we will get exception as " NegativeArraySizeException ".

    Example: int [] arr=new int[-3];
                   
    Output as:-Exception in thread "main" java.lang.NegativeArraySizeException

*/

// Sample Code
public class ArraySizeZeroProgram03 {
	public static void main(String[] args) {
		
		int arr []=new int[0];
		
		int arr1[]=new int[-2];
		
		System.out.println(arr.length);
		System.out.println(arr1.length);
	}

}
