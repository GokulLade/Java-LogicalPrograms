package com.nit.logical.array.day08;
/*
 Anonymous Array
___________________________
 ->An array in Java without any name is known as an anonymous array. It is an array just for creating and using instantly. Using an anonymous array, we can pass an array with user values without the referenced variable.

  Adv:- we can call the diff type of array by created the method type of Object and calling the 
      method by creating the anonymous array 

 * */
// Sample code:

class Student{
	int studentRollNumber;
	String studentName;
	
	public Student(int studentRollNumber, String studentName) {
		super();
		this.studentRollNumber = studentRollNumber;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return "Student [studentRollNumber=" + studentRollNumber + ", studentName=" + studentName + "]";
	}
	
	
	
}
public class AnonymousArrayProgram02 {

	public static void main(String[] args) {
		
		Student stud[]= {new Student(101, "Gokul"), new Student(102, "Ganesh"), new Student(103, "Swapnil")};
		
		for(Student value:stud) {
			System.out.println(value);
		}
		

	}

}
