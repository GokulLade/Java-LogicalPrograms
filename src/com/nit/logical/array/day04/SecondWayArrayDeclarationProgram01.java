package com.nit.logical.array.day04;

import java.util.Arrays;

/*
Second Way :
 
 Syntax:-
	DataType [] variableName={element,elements,elements,elements};

 Example:-
    int [] x = {12,23,34,45};

 Note :-We should use above approach 
        > When size of the array we know.
        > Values of the array we know.
   
 Adv:- We can create and initilize the array in the same line.

*/

/* Write a java program to create the array with 2nd way of creation process and insert the primitive data
  and also print all elements?(also check that is it possible to insert varaible name).*/

public class SecondWayArrayDeclarationProgram01 {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
		
		System.out.println("------------------------------------------------");
	
		int i1=10,i2=20,i3=40;
		char ch='A';
		String name="Gokul";
		
		Object obj[]= {i1,i2,i3,ch,name};
		
		System.out.println(Arrays.toString(obj));

	}

}
