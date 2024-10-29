package com.nit.logical.string.day09;

/*
 
 StringBuffer and StringBuilder Method:
 
	   capacity()
       append() 
       insert()  
       indexOf()
       replace()
       isEmpty()
       delete()
       deleteCharAt()
       reverse()
       length()
       compareTo()
       contentEquals()
       setCharAt()


*/

// Sample program on StringBuffer and StringBuilder Method:
public class StringBufferMethodProgram01 {

	public static void main(String[] args) 
	{
		 StringBuffer sb=new StringBuffer("abc");
		 
		 System.out.println(sb.capacity());
		 
		 sb.append("abc");
		 System.out.println(sb.capacity());
		 sb.append("def");
		 System.out.println(sb.capacity());
		 sb.append("12345678901");
		 System.out.println(sb.capacity());
		
		 sb.insert(1, 'z');
		 System.out.println(sb);
		 sb.setCharAt(1, 'g');
		 System.out.println(sb);
		 sb.replace(1, 4, "ghiaef");
		 System.out.println(sb);
		 
		 StringBuilder sb1=new StringBuilder("abc");
		 String s1=new String("abc");
		 System.out.println(s1.contentEquals(sb));
		 System.out.println(s1.contentEquals(sb1));
		 
		 
		 System.out.println(sb.delete(1, 5));
		 System.out.println(sb.deleteCharAt(4));
		 System.out.println(sb.reverse());
		 System.out.println(sb.isEmpty());
		 System.out.println(sb.indexOf("c"));
		 System.out.println(sb.replace(1, 6, "j"));
		 System.out.println(sb.insert(1, "java"));
		 System.out.println(sb.insert(4, "java"));

	}

}
