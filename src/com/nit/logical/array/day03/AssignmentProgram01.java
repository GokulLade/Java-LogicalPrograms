package com.nit.logical.array.day03;

import java.util.Arrays;
import java.util.Scanner;

class Student{
	private int studentId;
	private String studentName;
	
	Student(int studentId, String studentName){
		this.studentId=studentId;
		this.studentName=studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
}

public class AssignmentProgram01 {
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
	
		int studentID;
		String studentName;
		
		System.out.println("How Many Student You Want to Add..!!");
		int size=scanner.nextInt();
		
		
		Student stud[]=new Student[size];
		
		for(int i=0;i<stud.length;i++) {
			System.out.println("Enter the Student ID : ");
			studentID=scanner.nextInt();
			
			System.out.println("Enter Student Name : ");
			studentName=scanner.next();
			
			stud[i]=new Student(studentID, studentName);
		}
		
		System.out.println("Student Details are :");
		
		System.out.println(Arrays.toString(stud));
		
		
		scanner.close();

	}
	

}
