package com.nit.logical.string.day03;

/*

Q1. What is String constant Pool?
	->String pool is a storage space in the Java heap memory where string literals are stored.
      It is also known as String Constant Pool or String Intern Pool. It is privately maintained 
      by the Java String class. By default, the String pool is empty. A pool of strings decreases the 
      number of String objects created in the JVM, thereby reducing memory load and improving performance.
      Upto 1.6 it was inside the method area 
      after 1.6 mean from 1.7 it is present inside the heap memory area 

	For Example :
	  String s1=new String("Abc");
	  String s2=new String ("Abc");
 
	So because of the new keyword 2 object will be created inside the heap memory area and the contant is same
	as a result only one object is created inside the string constant pool area because as we know the String 
	object is created inside the String pool area and if the content is same it will not create a new object both 
	will point to the same object inside the String constant pool area.
 */
public class StringConstantPoolProgram01 {
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args)
	{
		String s1=new String("Abc");
		String s2=new String("Abc");
		System.out.println(s1==s2); //flase

		String s3=new String("Abc");
		String s4="Abc";
		System.out.println(s3==s4); //false

		String s5="Abc";
		String s6="Abc";
		System.out.println(s5==s6); //true
			 
		String s7="Abc";
		String s8="def";
		System.out.println(s7==s8); //flase
			  
		String s9="Abc";
		String s10=""+ "Abc";
		System.out.println(s9==s10); //true
			  
		String s11="Abc";
		String s12=" ";
		s12=s12.concat(s11);
		System.out.println(s11==s12); //flase
			  
		String s13="Abc";
		String s14=s13.concat("def");
		System.out.println(s13+" "+s14);
		System.out.println(s13==s14);
			  
			  
		String s15="Abc";
		String s16="def";
		s15.concat(s16);
		System.out.println(s15+" "+s16);
		System.out.println(s15==s16);
			  
		String s17 = "Hello java";
		String s18 = new String(s17);
		System.out.println((s17 == s18) + " " + s17.equals(18));
			  
		String s19="abc";
		String s20="abc";
		System.out.println("s19==s20 :"+s19==s20);
			  
		String s21="abc";
		String s22="abc";
		System.out.println("s21==s22 :"+(s21==s22));

		
	}

}
