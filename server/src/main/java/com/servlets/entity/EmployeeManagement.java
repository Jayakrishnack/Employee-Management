package com.servlets.entity;



public class EmployeeManagement {
	 
			// Student class definition
			
			    // Fields for id, name, and age
			    private int id;
			    private String name;
			    private int age;
			    private String mail;
			    private double salary;
			    

			    

				public String getMail() {
					return mail;
				}

				public void setMail(String mail) {
					this.mail = mail;
				}

				public double getSalary() {
					return salary;
				}

				public void setSalary(double salary) {
					this.salary = salary;
				}

				// Constructor to initialize the Student object
			    public EmployeeManagement(int id, String name, int age,String mail,double salary) {
			        this.id = id;
			        this.name = name;
			        this.age = age;
			        this.mail=mail;
			        this.salary=salary;
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
			        System.out.println("emp ID: " + id);
			        System.out.println("emp Name: " + name);
			        System.out.println("emp Age: " + age);
			        System.out.println("emp mail: "+mail);
			        System.out.println("emp salary: "+salary);
			    }
			}

			
		 




