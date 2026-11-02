package com.student;

public class Student {
	
	private final int studentId;
	private final String studentName;
	private final int age;
	private final int marks;
	
	//constructor
	public Student(int studentId, String studentName, int age, int marks) {
		
		//age check
		if(age < 1 || age > 100) {
			throw new IllegalArgumentException("Age must be between 1 and 100");
		}
		
		//marks check
		if(marks < 0 || marks > 100) {
			throw new IllegalArgumentException("Marks must be between 0 and 100");
		}
		
		//Id check
		if(studentId <= 0) {
			throw new IllegalArgumentException(" Id Must be greater than 0");
		}
		//name check
		if(studentName == null || studentName.isBlank()) {
			throw new IllegalArgumentException("Name Must not be null or empty");
		}
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.marks = marks;
		
	}
	
	//getters
	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getMarks() {
		return marks;
	}
	
	
	//calculateGrade method
	public char calculateGrade() {
		
		if(this.marks >= 90) {
			return 'A';
		}else if(this.marks >= 80) {
			return 'B';
		}else if(this.marks >= 70) {
			return 'C';
		}else if(this.marks >= 60) {
			return 'D';
		}else {
			return 'F';
		}
		
	}
	
	//check pass or fail
	public boolean isPassed() {
		return this.marks >= 40;
	}
	
	
	//displayDetails method
	public void displayDetails() {
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Marks : " + marks);
		System.out.println("Grade : " + calculateGrade());
		if(isPassed()) {
			System.out.println("Result : PASS");
		}else {
			System.out.println("Result : FAIL");
		}
		System.out.println("Student ID : " + studentId);
	}
}
