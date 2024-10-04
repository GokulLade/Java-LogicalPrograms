package com.nit.logical.array.day08;


/*
 
 *Compare 2 array lexographically
   
   
     {1,2,3,4,5};
     {1,2,3,4,5};
     if the size of the array and element of the array is 
     matched return 0;
     
     {11,2,3,4,5};
     {1,2,3,4,5};
     if the size is same but element is diff 
     then if the 1st array element is > 2nd array element
     return +ve 1;
     
     {1,2,3,4,5};
     {11,2,3,4,5};
     if the size is same but element is diff 
     then if the 1st array element is < 2nd array element
     return -ve -1;
     
     {1,2,3,4}
     {1,2,3,4,5};
     |- element is same but size is diff
        then if the 1st array size < 2nd array size 
        return -ve as diff in size
    
     {1,2,3,4,5,6}
     {1,2,3,4,5};
     |- element is same but size is diff
        then if the 1st array size > 2nd array size 
        return +ve  as diff in size   
     
*/
public class CompareTwoArraylexographicallyProgram04 {

	public static int mycompare(int [] arr1,int [] arr2) {
		 if(arr1.length==arr2.length) 
		 {
			  for(int i=0;i<arr2.length;i++) 
			  {
				   if(arr1[i]!=arr2[i]) 
				   {
					    if(arr1[i]>arr2[i]) 
					    {
					    	 return 1;
					    }
					    else 
					    {
					    	 return -1;
					    }
				   }
			  }
		 }
		 return arr1.length-arr2.length;
	}
public static void main(String[] args) {
	int [] arr1= {1,12,3,4,5,6,7,8,9};
	int [] arr2= {1,12,3,4,5,6,7,8};
	System.out.println(CompareTwoArraylexographicallyProgram04.mycompare(arr1, arr2));
}

}
