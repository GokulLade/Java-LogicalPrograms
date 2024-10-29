package com.nit.logical.string.stringinterviewquestion;

import java.io.Serializable;

//About serialization and deserialization 

public class StudentDetails implements Serializable{
	private static final long serialVersionUID = 1L;
	private transient int rollNumber;
	private String name;
	private String collegeName;
	
	public StudentDetails(int rollNumber, String name, String collegeName) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "StudentDetails [rollNumber=" + rollNumber + ", name=" + name + ", collegeName=" + collegeName + "]";
	}	
	
	
}

