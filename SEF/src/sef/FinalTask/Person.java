package sef.FinalTask;

public class Person extends Final {

	private String name;
	private int age;
	
	
	public Person() {
}

	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	public void intoduce() {
		System.out.println("My name is " + name + ", I am " + age + "years old");
	}

	public void announce() {
		System.out.println("I am study in university" + school);
		// TODO Auto-generated method stub
		
	}}