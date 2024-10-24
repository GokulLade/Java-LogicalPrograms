package com.nit.logical.string.day06;
/* 
 
 Contain method will tell that the searching string is present or not but if 
 we want to find where it that searching character are there then we can go
 with the method known as indexOf()
 
 So indexOf method return the place of the searching character (place means
 the index position)
		 
 If there are multiple character present with the same as the searching
 character then it will return the index position of the starting index of the
 searching element because the searching will always start from the 0 index of
 string.(you can also call it as 1st occurrence searching ). it start searching
 from 0 index forward direction.
		 
 Same rules apply for the index of method whose parameter is of string type.
		  
 If you want the last Index of the searching element string then we can use
 lastIndexOf() it will return the last index of the searching string. it start
 searching from last Index to backward direction.
		  
 If you want to find the searching element from the middle of the index
 means there is no pre define method instead of that we can write index of
 method with the searching position. for searching from first occurrence method
 name is : indexOf(char , fromIndex);
	       indexOf(String,fromIndex);
		  
 If you want to find the searching element from the choice place also from the
 last Index onwards then the method is lastIndexOf(Char,fromIndex)
		  
 If the index for element which we are searching is not available then indexof will return
 -1 this will follow in lastIndexOF method also
		  
 If in the index of method we are searching the string from the index which is
 not present means if i search with the index from -ve then it will search the
 character from the 0 index onwards because there is 1 condition written inside
 index of that if( index <0) index=0;
		  
 above rule for last Index of that if we searching the character from the index
 which is not present for example we are searching as lastIndexOf('a',-5) it
 will search from -5 index to backward direction and as a result it will give
 the output as -ve that is -1. because in backward searching there will be no
 any index present.
		  
		 
 if the index of method if we are searching the character from the end of
 the length of the string then index of search the element from the choice
 place to forward direction as a result no any index is there it return the
 Ans in -ve that is -1.
		  
		  
 If the last index of method if we are searching the element from the choice
 index position and the index is greater than the choice index length then
 there is one condition in index of method. if(index > length)
 index=length()-1; then it will search from length -1 backward direction.

 if the search character is the same place of the choice
		  
 Note: IndexOf method we will never going to use in for finding the index of
	   the character most of the time index of method is used to searching.
		  
 So there is the confusion that for searching we are using indexOf method for
 finding also we have to use indexOf method that's why from java 1.4 onwards
 the things are separated so for finding the thing we are using the method
 contain() and for searching in which index we are going to use indexOf()
		  
		  
		  
*/

// Sample program on searching methods
public class SearchingStringMethodProgram02 {

	public static void main(String[] args) 
	{
		String s1 = "hi good morning we are going with the string programs";
		System.out.println(s1.equals("program"));
		System.out.println(s1.compareTo("program"));
		System.out.println(s1.contains("program"));
		System.out.println("------------------------------");
		
		String s2 = "hi good morning we are going with the programs on String";
		System.out.println(s2.equals("program"));
		System.out.println(s2.compareTo("program"));
		System.out.println(s2.contains("program"));
		System.out.println("-------------------------------");
		
		String s3 = "hi good morning we are going with the programs on String";
		System.out.println(s3.equals("Program"));
		System.out.println(s3.compareTo("Program"));
		System.out.println(s3.contains("Program"));
		System.out.println(s3.toLowerCase().contains("program"));
		System.out.println();
		
		String s4 = "hello everyone S";
		// System.out.println(s4.compareTo('S'));
		System.out.println(s4.compareTo("J"));
		System.out.println();
		
		String s5 = "hello welcome to nareshit to lab";
		System.out.println(s5.contains("i"));
		System.out.println(s5.indexOf('i'));
		System.out.println(s5.indexOf('o'));
		System.out.println(s5.indexOf("to"));
		System.out.println(s5.lastIndexOf('i'));
		System.out.println(s5.lastIndexOf("to"));
		System.out.println("length of the string " + s5.length());
		System.out.println(s5.indexOf('t', (s5.length() / 2)));
		System.out.println(s5.indexOf("it", (s5.length() / 2)));
		System.out.println(s5.lastIndexOf('l', 5));
		System.out.println(s5.indexOf('A'));
		System.out.println(s5.lastIndexOf('A'));
		System.out.println(s5.indexOf('e', -5));
		System.out.println(s5.indexOf('a', 32));
		System.out.println(s5.indexOf('e', 1));
		System.out.println(s5.indexOf("nareshit"));
		System.out.println(s5.lastIndexOf("nareshit"));

		if (s5.indexOf("nareshit") != -1) {
			System.out.println("The word nareshit is present");
		} else {
			System.out.println("The word nareshit is not present");
		}


	}

}
