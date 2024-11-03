package com.nit.logical.string.ExamPrograms;

/*
 Write a java program to print all duplicate elements from a given array.
Input  : arr = [1,2,1,3,4,6,2,5,4]
Output : 1 2 4 

Test Case 1
---------------
Input Array: [1, 2, 1, 3, 4, 6, 2, 5, 4]
Expected Output: Duplicate elements are: 1 2 4

*/
public class DuplicateArrayElementProgram04 {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,7,3,4,6,3,4,2,5,1,1};
		boolean isPrinted[]=new boolean[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{	
			if(isPrinted[i]) continue;
			
			boolean isDublicate=false;
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j])
				{
					isDublicate=true;
					isPrinted[j]=true;
				}
			}
			
			if(isDublicate) 
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}

	
}
