package com.nit.logical.array.day07;

import java.util.Scanner;

/*
  We have to make the array into half so that the execution flow
  will become faster 
  |-  formula
      int start= (starting index) 0
      int end= (ending index) arr.length-1
      int half=(start+end)/2;
      
  |- it will search the element until the end will be greater than
     start
      |- First it will search the element in the middle index 
          if it will found at the middle index then 
          at once print and break the logic
      |- if it is not in the middle index then we have to check 
         is the searching element is greater than or smaller than 
         the middle index 
         |- if search element is greater than the middle index 
            |- start=half+1
                and then again we will make the element in half 
                with the new value and start searching from 
                middle index 
         |- if search element is smaller than the middle index 
             |- end= half-1;
             and then again we will make the element in half 
             with the new value and start searching from 
             middle index 
             
   |- if the end will become smaller than the start and though element
      not found then we have to give the statement as 
       "Element not available"
                 
*/
public class BinarySearchArrayProgram02 {

	public static void binarySearch(int arr[], int searchElement) {
		int startIndex = 0, endIndex = arr.length - 1, halfPlaceIndex = (startIndex + endIndex) / 2;

		while (endIndex >= startIndex) {

			if (searchElement == arr[halfPlaceIndex]) 
			{
				System.out.println("Element is found at position :" + (halfPlaceIndex+1));
				break;
			} 
			else if (searchElement > arr[halfPlaceIndex]) {
				startIndex = halfPlaceIndex + 1;
			} 
			else if (searchElement < arr[halfPlaceIndex]) 
			{
				endIndex = halfPlaceIndex-1;
			}

			halfPlaceIndex = (startIndex + endIndex) / 2;
		}
		if (endIndex < startIndex) {
			System.out.println("Element is not found...!!");
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many Element you want to Store in array..!!");
		int size = scanner.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Element for index : " + (i + 1));
			arr[i] = scanner.nextInt();
		}

		System.out.println("Enter the Element which you want to search..!!");
		int searchElement = scanner.nextInt();

		BinarySearchArrayProgram02.binarySearch(arr, searchElement);

		scanner.close();

	}

}
