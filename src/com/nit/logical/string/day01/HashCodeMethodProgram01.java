package com.nit.logical.string.day01;

/*
 Hashcode() :

Q1.Can we say the hashcode() method compare the object 
   that is the object is same or not?
  
	=> No because every wrapper class and every pre define java classes had equals() 
	   and hashcode() overriden in their classes as a result IF THE CONTENT IS SAME 
	   THE HASHCODE WILL BE  SAME AND IF THE CONTENT IS DIFF THE HASHCODE IS DIFF
	
 */

// Sample program
public class HashCodeMethodProgram01 {

	public static void main(String[] args)
	{
		String name1="Gokul";
		String name2="gokul";
		String name3="Gokul";
		
		System.out.println(name1.hashCode()==name2.hashCode()); //flase
		System.out.println(name1.hashCode()==name3.hashCode()); //true
		System.out.println(name1.hashCode());
		

	}

}
