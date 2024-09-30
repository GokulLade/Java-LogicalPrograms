package com.nit.logical.array.day03;


public class Assignment02 {
	
	public static int[] calculation(int arr[]) {
		int sum=arr[0],sub=arr[0],mul=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			sub-=arr[i];
			mul+=arr[i];
		}
		
		int result []= new int[] {sum,sub,mul};
		
		return result;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		int arr2[]=Assignment02.calculation(arr);
		
		System.out.println("The Sum is "+arr2[0]);
		System.out.println("The subtraction is "+arr2[1]);
		System.out.println("The Multiplication is "+arr2[2]);
		
		

	}

}
