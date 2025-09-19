package com.nit.logical.array.day03;

/*
 Q1. What will be the possible value we can use for creating array size?

  Solution:- we can declare int as size ,char as size , byte as size, short as size 
             because these range are smaller than the int range. But if try to add 
             size as long which is greater than int range we will get Compile time
             error.
*/
public class ArraySizeDefineWaysProgram04 {

	public static void main(String[] args) 
	{
		int [] arr=new int[3];
	    System.out.println(arr.length);
	    
	    int [] arr2=new int['A'];
	    System.out.println(arr2.length);
	    
	    byte b=20;
	    int [] arr3=new int[b];
	    System.out.println(arr3.length);
	    
	    short s=30;
	    int [] arr4=new int[s];
	    System.out.println(arr4.length);
	    
//	    long l=45l;
//	    int [] arr5=new int[l];//-----------------------compile time error in this line 
//	    System.out.println(arr5.length);

	}

}
