package sef.module6.activity;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I extends Person_I {
	
	//Attributes
	private int salary;
	private String title;
	
	
	
	public Employee_I (){ 
		System.out.println("I'm Employee_I constructor"); }
	//Behavior - write default constructor. Print 'I'm an Employee_I Constructor'
	
		public int getsalary() {
			return salary ;}
	// write getter for int salary
			public void setSalary(int salary) {
				this.salary = salary;}
	
	// write setter for int salary
				public String gettitle() {
					return title;}
	
	// write getter for String title
					public void settitle(String title) {
						this.title = title;}
	
	// write setter for String title
	
}
