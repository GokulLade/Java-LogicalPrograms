package com.nit.logical.array.day05;

import java.util.Arrays;

/*
 Q11. Given an integer array length 2,return true if it contains a number 2 or 3. 
*/
public class CheckNumberInArrayProgram11 {
	
	public static boolean checkNumber(int arr[]) {
		if((arr[0]==2 || arr[1]==2) && (arr[0]==3 || arr[1]==3)) {
			return true;
		}
		return false;
	}

	
	public static void main(String[] args) {
		
		int arr[]= {3,2};
		
		System.out.println(CheckNumberInArrayProgram11.checkNumber(arr));
		

	}

}
