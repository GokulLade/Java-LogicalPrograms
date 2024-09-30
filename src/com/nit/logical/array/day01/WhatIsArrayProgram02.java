package com.nit.logical.array.day01;

import java.util.Scanner;
/*
 
Q1.What is an Array?
 
> An array is a collection of homogeneous type of element.
  It can hold multiple values of same type. 
   
   				OR
   
> Array is the collection of Homogeneous element which can store multiple value of same type.  
  But because of upcasting concept we can store multiple value of diff type
  
  for example :

    Object [] arr=new Object[3];
     
     
  ADv:
    1. Multiple value we can store
    2. It is faster way 
     
  Dis:
     1. fixed in size
     2. method not supported
 

Q2.How many way are there to create the array ?

> We can create the array in 3 way 
 |- 1st way of array creation and syntax
    -------------------------------------
   In Java we can create single dimensional array by using following ways :-

    Example 1 :
    -------------
    syntax
    __________
    DataType [] variableName=new DataType[size];

    int [] y = new int[5];
    
    Note:- We should use the example1 approach 
          * When we know type of value to store.
          * When we don't know number of value to store.
          * and also don't know actual value to store.

    Avd:-  We can take the array size dynamically from the user and also ask the user to store element 
           of their own choice.
*/

// Sample code
public class WhatIsArrayProgram02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many element you want to insert..!!");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		sc.close();
	}
}
