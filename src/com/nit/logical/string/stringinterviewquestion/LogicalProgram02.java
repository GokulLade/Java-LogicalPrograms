package com.nit.logical.string.stringinterviewquestion;

/*
 		SingleTon
 	___________________
    If THERE IS ONLY ONE OBJECT IS CREATED WITHIN THE SCOPE OF PACKAGE
    OR PROJECT IS KNOWN AS SINGLETON.
    
    
    By default every java class is non singleton
    for creating a java class as a singleton class
    few rules we have to follow
    
    |-Stop other for creating the object of
       your class
       |- By creating the constructor as a private 
       
       
 Q1. When to create the class as a singleton 

   When there will be no instance variable in my class so if we create the multiple 
   object then in heap area the object is created as empty object that lead to memory
   waste to instead of creating multiple object we can create the static method for 
   executing the logic so that other can use it directly by the class name and then 
   create the constructor as private so that no other can create the object of your 
   class as a result only one object will be created that is by your class.
          
 */

class Student{
	
	private static Student ref=null;
	
	private Student() {
		
	}
	
	public static Student getObject()
	{
		if(ref==null)
		{
			ref=new Student();
		}
		return ref;
	}
	
}

class Om{
	
	public static void displayObject1()
	{
		Student s1=Student.getObject();
		System.out.println(s1.hashCode());
	}
}

class Ram{
	
	public static void displayObject2()
	{
		Student s1=Student.getObject();
		System.out.println(s1.hashCode());
	}
}



public class LogicalProgram02 {

	public static void main(String[] args) 
	{
		Om.displayObject1();
		
		Ram.displayObject2();	
	}

}
