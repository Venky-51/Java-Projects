package com.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	public static void addStudent(ArrayList<Student> studentObjectList, Scanner scan) {
		
		
		try {
			System.out.println("Enter Student Id: ");
			int id = Integer.parseInt(scan.nextLine().trim());
			
			//check duplicate ID
			if(findStudentById(studentObjectList, id) != null) {
				System.out.println("Student Id already exists! ");
				return;
			}
			
			System.out.println("Enter Student Name : ");
			String name = scan.nextLine();
			
			System.out.println("Enter Age: ");
			int age = Integer.parseInt(scan.nextLine().trim());
			
			System.out.println("Enter Marks : ");
			int marks = Integer.parseInt(scan.nextLine().trim());
			
			
			Student student = new Student(id, name, age, marks);
			
			studentObjectList.add(student);
			
			System.out.println("\nStudent added successfully!");
			
		}catch(NumberFormatException e) {
			System.out.println("Please enter valid numeric values!");
			
		}catch(IllegalArgumentException e) {
			System.out.println("Invalid student data : " + e.getMessage());
			
		}
	}
	
	
	
	//search student by Id
	public static Student findStudentById(ArrayList<Student> studentObjectList, int id) {
		
		for(Student student:studentObjectList) {
			
			if(student.getStudentId() == id) {
				return student;
			}
		}
		
		return null;
	}
	
	
	public static void searchStudent(ArrayList<Student> studentObjectList, Scanner scan) {
		
		System.out.println("Enter Student ID to search: ");
		int id;
		
		try {
			id = Integer.parseInt(scan.nextLine().trim());
			
		}catch(NumberFormatException e) {
			System.out.println("Please enter a valid Id!");
			return ;
			
		}
		
		Student student = findStudentById(studentObjectList, id);
		
		if(student != null) {
			
			System.out.println("\n-------Student Found-------");
			student.displayDetails();
			
		}else {
			System.out.println("Student not found!");
		}
	}
	
	
	//Delete Student by Id
	public static void deleteStudent(ArrayList<Student> studentObjectList, Scanner scan) {
		
		System.out.println("Enter Student ID to delete : ");
		
		int id;
		
		try {
			id = Integer.parseInt(scan.nextLine().trim());
			
		}catch(NumberFormatException e) {
			System.out.println("Please enter a valid ID!");
			return;
		}
		
		Student student = findStudentById(studentObjectList, id);
		
		if(student != null) {
			
			studentObjectList.remove(student);
			
			System.out.println("Student deleted successfully!");
		}else {
			System.out.println("Student Not Found! ");
		}
	}
	
	
	//main method
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Student> studentObjectList = new ArrayList<>();
		
		int choice = 4;
		
		do {
			System.out.println("\n================================");
            System.out.println("     STUDENT MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            
            
            try {
            	choice = Integer.parseInt(scan.nextLine().trim());
            	
            }catch(NumberFormatException e) {
            	System.out.println("Please enter a valid menu option!");
            	continue;
            }
            
            
            switch(choice) {
            case 1: 
            	addStudent(studentObjectList, scan);
            	break;
            	
            case 2:
            	searchStudent(studentObjectList, scan);
            	break;
            	
            case 3:
            	deleteStudent(studentObjectList, scan);
            	break;
            	
            case 4:
            	System.out.println("Thank you for using Student Management System");
            	break;
            	
            default:
            	System.out.println("Invalid choice! Please try again. ");
            }
            
		}while( choice != 4);
		
		scan.close();
	}
}
