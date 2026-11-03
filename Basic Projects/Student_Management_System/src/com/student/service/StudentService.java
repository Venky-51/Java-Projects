package com.student.service;

import com.student.model.Student;

public interface StudentService {
	
	public boolean addStudent(Student student);
	
	public Student searchStudent(int studentId);
	
	public boolean deleteStudent(int studentId);
	
	public boolean updateStudentMarks(int studentId, int marks);
	
	public void displayAllStudents();
	
	
	
	
}
