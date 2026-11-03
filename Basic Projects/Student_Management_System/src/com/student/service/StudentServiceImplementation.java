package com.student.service;

import java.util.ArrayList;

import com.student.model.Student;

public class StudentServiceImplementation implements StudentService{
	
	private ArrayList<Student> students = new ArrayList<>();

	
	//adding student
	@Override
	public boolean addStudent(Student student) {
		if(student == null) {
			throw new IllegalArgumentException("Student cannot be null");
		}
		Student studentTemp = findStudentById(student.getStudentId());
		if(studentTemp != null) {
			System.out.println("Student already exist with id :" + student.getStudentId() + "\nhere are the details\n");
			studentTemp.displayDetails();
			return false;
		}
		students.add(student);
		return true;
	}

	
	
	//searching student using id
	@Override
	public Student searchStudent(int studentId) {
		Student student = findStudentById(studentId);
		System.out.println("===============Student search===============\n");
		if(student != null) {
			System.out.println("Student Found with id: " + studentId + "\nhere are the details:\n");
			student.displayDetails();
			return student;
		}
		System.out.println("Student not Found with id: " + studentId + "\n");
		return null;
	}

	
	
	//deleting student using id
	@Override
	public boolean deleteStudent(int studentId) {
		Student studentTemp = findStudentById(studentId);
		//if student present in list then remove 
		System.out.println("===============Delete student===============\n");
		if(studentTemp != null) {
			System.out.println("Student Deleted with id: " + studentTemp.getStudentId() + "\n");
			students.remove(studentTemp);
			return true;
		}	
		System.out.println("Student not Found with id: " + studentId);
		return false;
	}
	
	
	
	//displaying all students
	@Override
	public void displayAllStudents() {
		System.out.println("==========Displaying All Student Details==========\n");
		if(!students.isEmpty()) {
			for(Student student:students) {
				student.displayDetails();
			}
		}else {
			System.out.println("Student list is empty");
		}
	}
	
	
	
	//updating student marks
	@Override
	public boolean updateStudentMarks(int studentId, int marks) {
		Student studentTemp = findStudentById(studentId);
		System.out.println("===============Updating Marks===============\n");
		if(studentTemp != null) {
			studentTemp.setMarks(marks);
			System.out.println("Student with id: " + studentId + ", Updated Marks are : " + studentTemp.getMarks()+"\n");
			return true;
		}
		System.out.println("Student not Found with id: " + studentId+"\n");
		return false;
	}
	

	
	//adding-searching helper function
	private Student findStudentById(int studentId) {
		for(Student student:students) {
			if(student.getStudentId() == studentId) {
				return student;
			}
		}
		return null;
	}
}
