package com.servlets;

 class Student {
	// Student class definition
	
	    // Fields for id, name, and age
	    private int id;
	    private String name;
	    private int age;

	    // Constructor to initialize the Student object
	    public Student(int id, String name, int age) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	    }

	    // Getter and Setter methods for id
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    // Getter and Setter methods for name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter and Setter methods for age
	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    // Method to display student details
	    public void displayStudentDetails() {
	        System.out.println("Student ID: " + id);
	        System.out.println("Student Name: " + name);
	        System.out.println("Student Age: " + age);
	    }
	}

	
 class Main {
	    public static void main(String[] args) {
	        // Creating a Student object
	        Student student1 = new Student(1, "John Doe", 20);
	                

	        // Displaying student details
	        student1.displayStudentDetails();

	        // Modifying the student's details using setters
	        student1.setName("Jane Doe");
	        student1.setAge(21);

	        // Displaying updated student details
	        System.out.println("\nUpdated Student Details:");
	        student1.displayStudentDetails();
	    }
	}



