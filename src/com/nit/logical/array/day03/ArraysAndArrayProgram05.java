package com.nit.logical.array.day03;

import java.util.Arrays;
import java.util.Scanner;

/*
 Q1 What Difference between Arrays and array?
____________________________________________________________________________________________
      Arrays                          |            array                                    |
______________________________________|_____________________________________________________|
> Arrays is a class                   | >  array is an object                               |
                                      |                                                     |
> Arrays are the predefine classes    | >  We can create the array by using                 |
  we no need to create it by ourself  |    both primitive type and reference type.          |
                                      |                                                     |
> Arrays class supports method means  | >  The array which we are going to create           |
  if we want to do some operation and |    which the array type object that will not        |
  don't want to write logic we can use|    support any method means if we want to           |
  the predefine method present in the |    perform some operation we have to write          |
  array class by passing our array    |    the logic by ourself.                            |
  object reference.                   |                                                     |
                                      |                                                     |
> Arrays is the class which present in| >  The array as we know it's an object which        |
  java.util package.                  |    we will create will be in our own package        |
                                      |    where it's created.                              |
                                      |                                                     |
> Arrays is the class which is        | > Arrays store both homogenous                      |
  predefine ,we are using this class  |   as well as heterogenous element.                  |
  for providing the support if some   |                                                     |
  predefine methods.                  |                                                     |
                                      |                                                     | 
> Arrays predefine methods are static | >  array object have no support of the              |
  and overloaded method.              |    method. Also our created array are fixed in size |
______________________________________|_____________________________________________________|

 Q2.Without using for loop can you print the array elements?
      
  Solution :By using Arrays class method that is Arrays.toString()
			it's a static method present in Arrays class that why we can call with the class name 
			total of 8 primitive type of Arrays.toString() method is present in the Arrays class
			and 1 reference type.
			Because we can create the array as all primitive and reference type.

*/

// Write a program to read the input from the user in array and print without using for loop
public class ArraysAndArrayProgram05 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the value for "+(i+1)+" Element");
			arr[i]=scanner.nextInt();
		}
		
		
		System.out.println("Array Elements are :"+Arrays.toString(arr));
		
		scanner.close();
	}

}
