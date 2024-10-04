package com.nit.logical.array.day08;

/*
Comparing The array 
____________________________

  -> Compare 2 array 
  -> If all the element is same return true else return false
  -> If the size of the array is diff then return false
  -> else check the element for comparing

*/
public class ComparingTwoArrayProgram03 {
	
	
	public static boolean comparingArray(int arr1[],int arr2[]) {
		int flag=1;
		if(arr1.length==arr2.length) 
		{
			for(int i=0;i<arr1.length;i++) 
			{
				if(arr1[i]!=arr2[i]) 
				{
					flag=0;
					break;
				}
			}
			
			if(flag==1) {
				return true;
			}
			else {
				return false;
			}
			
			
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {4,2,3,4,5};
		
		System.out.println(ComparingTwoArrayProgram03.comparingArray(arr1,arr2));
	}


}
