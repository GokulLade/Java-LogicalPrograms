package com.nit.logical.array.day04;

import java.util.Arrays;

/*Write a java program to create the array with 2nd way of creation process and insert the your class details
       in the array and also print it by using for loop and also print without using for loop */
class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName)
	{
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
}
public class ClassDetailInArrayProgram02 {

	public static void main(String[] args) {
		
		Student s1=new Student(101, "Gokul");
		Student s2=new Student(102, "Ganesh");
		Student s3=new Student(103, "Swapnil");
		
		Student student[]= {s1,s2,s3};
		
		// Using for loop
		for(int i=0;i<student.length;i++) {
			System.out.println(student[i]+" ");
		}
		
		// Without using for loop
		System.out.println(Arrays.toString(student));

	}

}
