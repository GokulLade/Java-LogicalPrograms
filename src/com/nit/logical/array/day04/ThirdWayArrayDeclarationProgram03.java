package com.nit.logical.array.day04;

import java.util.Arrays;

/* Third Way:
  
    Syntax
    	DataType [] variableName=new DataType[]{element,elements,elements,elements};
	
	Example:
    	int [] z = new int[]{10,20,30};
     
    We can write this syntax in this way also
    int [] z;
    z= new int []{10,20,30};
  
 	Note:- > We should use this approach if we want to declare array in seperate line
           	 and if we want to initilize the array in seperate line.
           > We should use the example3 approach when we want to send the array as a return type to the method
             by creating new array.
*/

//Sample Program for example 3 array creation

public class ThirdWayArrayDeclarationProgram03 {

	public static void main(String[] args) 
	{
		int arr[]=new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		
		int i1=1,i2=2;
		int [] arr2=new int[] {i1,i2};
		System.out.println(Arrays.toString(arr2));

	}

}
