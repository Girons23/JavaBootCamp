package FinalTask;

public class Employee extends Person {
	
	private double salary;
	private String title;
	private String company;
	
	
	
	public Employee(){ 
		System.out.println("I'm an Employee_A Constructor"); 
	}
		
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getTitle() {
		return title;
	}
	

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getcompany(){
		return company;
	}
	
	public void setcompany(String company){
		this.company= company;
	}}