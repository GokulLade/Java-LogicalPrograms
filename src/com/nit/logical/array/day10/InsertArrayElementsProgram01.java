package com.nit.logical.array.day10;

import java.util.Arrays;
import java.util.Scanner;

// Insert the element based on the user choice element and user choice index
public class InsertArrayElementsProgram01 {

	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ELEMENT WHICH YOU WANT TO INSERT IN THE ARRAY");
		int element=sc.nextInt();
		System.out.println("ENTER THE PLACE OR INDEX WHERE YOU WANT TO ADD THE ELEMENT");
		int place=sc.nextInt();
		
	    arr=Arrays.copyOf(arr, arr.length+1);
	    System.out.println(Arrays.toString(arr));
		
		// logic for shifting
	       
	    for( int i=arr.length-1;i>place-1;i--) 
	    {
	        arr[i]=arr[i-1];
	        System.out.println(Arrays.toString(arr));
	    }
	     /*
	      
	        [1, 2, 3, 4, 5, 6, 0]
	        [1, 2, 3, 4, 5, 6, 6]
	        [1, 2, 3, 4, 5, 5, 6]
	        [1, 2, 3, 4, 4, 5, 6]
	        [1, 2, 3, 3, 4, 5, 6]
	        
	     */
	    
		// Add the element
	    arr[place]=element;
	    System.out.println(Arrays.toString(arr));

	}

}
