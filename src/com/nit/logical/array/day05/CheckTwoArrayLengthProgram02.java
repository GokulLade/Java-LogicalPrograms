package com.nit.logical.array.day05;

/*
 Q2. Given 2 arrays of integers, a and b, return true if they have the same first element or they have the 
	 same last element. Both arrays will be length 1 or more.
*/

public class CheckTwoArrayLengthProgram02 {
	
	public static boolean checkArray(int a[],int b[]) {
		if(((a.length>0) && (b.length>0)) && ((a[0]==b[0]) ||(a[a.length-1]==b[b.length-1]))) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {0,24,2,5};
		
		System.out.println(CheckTwoArrayLengthProgram02.checkArray(a, b));

	}

}
