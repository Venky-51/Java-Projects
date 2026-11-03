package com.student.main;

import com.student.model.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImplementation;

public class Main {
	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImplementation();
		
		Student student1 = new Student(1, "venky", 22, 76);
		Student student2 = new Student(2, "mouni", 21, 96);
		Student student3 = new Student(3, "chandu", 23, 86);
		Student student4 = new Student(4, "yashwanth", 24, 86);
		Student student5 = new Student(5, "sagar", 22, 75);
		Student student6 = new Student(6, "sathivika", 25, 95);
		
		service.addStudent(student1);
		service.addStudent(student2);
		service.addStudent(student3);
		service.addStudent(student4);
		service.addStudent(student5);
		service.addStudent(student6);
		
		
		service.displayAllStudents();
		
		service.searchStudent(5);
		
		service.deleteStudent(50);
		
		service.updateStudentMarks(1, 99);
		
		service.displayAllStudents();
		
		
		
		
	}
}
