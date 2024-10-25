package com.nit.logical.string.day07;

import java.util.Arrays;

public class SpiltMethodProgram03 {

	public static void main(String[] args) 
	{
		String s = "hello everyone we are doing string program";
		
		System.out.println(s.length());
		String[] value = s.split(" ");
		System.out.println(value.length);
		System.out.println(java.util.Arrays.toString(value));
		String[] value1 = s.split("e");
		System.out.println(value1.length);
		System.out.println(Arrays.toString(value1));
		
		String[] value2 = s.split("E");
		System.out.println(value2.length);
		System.out.println(Arrays.toString(value2));
		
		String[] value3 = s.split("hello everyone we are doing string program");
		System.out.println(value3.length);
		System.out.println(Arrays.toString(value3));
		String[] value4 = s.split("h");
		System.out.println(value4.length);
		System.out.println(Arrays.toString(value4));
		String[] value5 = s.split("m");
		System.out.println(value5.length);
		System.out.println(Arrays.toString(value5));
		System.out.println();

		String s2 = "xyz xyz xyz";
		String value6[] = s2.split("x");
		System.out.println(value6.length);
		System.out.println(Arrays.toString(value6));
	    System.out.println();
		String ss2 = "xyz xyz xyz";
		String value7[] = ss2.split("z");
		System.out.println(value7.length);
		System.out.println(Arrays.toString(value7));

		String sss2 = "xyz xyz xyz";
		String value8[] = sss2.split("xyz");
		System.out.println(value8.length);
		System.out.println(Arrays.toString(value8));

		String ssss2 = "xyz xyz xyz";
		String value9[] = ssss2.split(" xyz");
		System.out.println(value9.length);
		System.out.println(Arrays.toString(value9));

		String s3 = "y";
		String value10[] = s3.split("y");
		System.out.println(value10.length);
		System.out.println(Arrays.toString(value10));

		String s4 = "yyyyyyyz";
		String value11[] = s4.split("y");
		System.out.println(value11.length);
		System.out.println(Arrays.toString(value11));

		String s5 = "abc.html";// |
		String value12[] = s5.split(".");
		System.out.println(value12.length);
		System.out.println(Arrays.toString(value12));

		String s6 = "abc.html";
		String value13[] = s6.split("\\.");
		System.out.println(value13.length);
		System.out.println(Arrays.toString(value13));

		String s7 = "a1A2B4b5C---c@";
		String value14[] = s7.split("[A-z]");
		System.out.println(value14.length);
		System.out.println(Arrays.toString(value14));
		System.out.println("-------------------------------------");
		String s8 = "a1A2B4b5C---c@";
		String value15[] = s8.split("[0-9]");
		System.out.println(value15.length);
		System.out.println(Arrays.toString(value15));
	}

}
