package com.nit.logical.string.day07;

/*
 
	About SubString
___________________________
	In Java, a Substring is a part of a String or a subset of the String. There are two variants of the substring() method.
	
	public String substring(int startIndex)
	public String substring(int startIndex, int endIndex)
	
	
	The substring begins with the character at the specified index and extends to the end of this string.
	
	Syntax1
	____________
	public String substring(int begIndex);
	Parameters
	-----------
	begIndex: the begin index, inclusive.
	
	Return Value
	The specified substring.
	
	Syntax2
	_____________
	public String substring(int begIndex, int endIndex);
	Parameters
	-----------
	beginIndex :  the begin index, inclusive.
	endIndex :  the end index, exclusive.

 
 */

// Sample program on substring method
public class SubStringMethodProgram02 {

	public static void main(String[] args) 
	{
		 String s = "hello everyone";
		
		
		 System.out.println(s.equals("hello"));
		 System.out.println(s.toString());
		 System.out.println(s.compareTo("Hello"));
		 System.out.println(s.indexOf('l'));
		 System.out.println(s.lastIndexOf('l', 500));
		
		 System.out.println(s.substring(1));
		 System.out.println(s.substring(14));
		 System.out.println(s.substring(4, 8));

		 System.out.println(s.substring(6, 11));
		 System.out.println(s.substring(5, 13));
		 System.out.println(s.substring(4, 14));
		 System.out.println(s.substring(3, 15));
		 System.out.println(s.substring(-6, 11));
		 System.out.println(s.indexOf("e", -5));
		 System.out.println(s.substring(6, -11));
		 System.out.println(s.substring(5, 14));

		 System.out.println(s.substring(5, 6));
		 System.out.println(s.substring(5,6).isEmpty());
		 System.out.println(s.substring(5,6).isBlank());

		 System.out.println(s.substring(5,5).isBlank());

		 System.out.println(s.startsWith("hello"));
		 System.out.println(s.endsWith("everyone"));
		 
		 System.out.println(s.startsWith("h"));
		 System.out.println(s.endsWith("e"));
		
		 System.out.println(s.startsWith("e"));	

	}

}
