package com.nit.logical.array.day10;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArrayElementProgram02 {

	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		
	    try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the element which you want to delete");
			int ele=sc.nextInt();
			
			int flag=0;
			for(int i=0;i<arr.length;i++) 
			{
				 if(arr[i]==ele) 
				 {
					  for(int j=i;j<arr.length-1;j++)
					  {
						   arr[j]=arr[j+1];
					  }
					  
					  flag=1;
					  break;  
				 }
			}
			if(flag==0) {
				 System.out.println("ELEMENT NOT FOUND!!!!");
			}
			else { 
				System.out.println("ELEMENT DELETED");
				for(int i=0;i<arr.length-1;i++) {
					 System.out.print(arr[i]+" ");
				}
			}
		}

	}

}
