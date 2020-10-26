package sef.FinalTask;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe e1= new Employe();
		e1.setsalary(30000000);
		e1.setName("LeBron James");
		e1.settitle("Basketball player");
		e1.setcompany("NBA");
		e1.setAge(35);
		
		
		Employe e2= new Employe();
		e2.setsalary(8000000);
		e2.setName("Alex Ovechkin");
		e2.settitle("Hockey player");
		e2.setcompany("NHL");
		e2.setAge(37);
		
		Employe e3= new Employe();
		e3.setsalary(500);
		e3.setName("Girts Freimanis");
		e3.settitle("trainee");
		e3.setcompany("Accenture");
		e3.setAge(24);
	
		List(Employe) list = 
				list.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));

		
		
		System.out.println("-----------------------------");
		System.out.println("Employee's Name is   : " + e1.getName());
		System.out.println("Employee's Age is    : " + e1.getAge());
		System.out.println("Employee's Title is  : " + e1.gettitle());
		System.out.println("Employee's Salary is : " + e1.getsalary());
		System.out.println("Employee's Company is : " + e1.getcompany());
		
		System.out.println("-----------------------------") ;
		System.out.println("Employee's Name is   : " + e2.getName());
		System.out.println("Employee's Age is    : " + e2.getAge());
		System.out.println("Employee's Title is  : " + e2.gettitle());
		System.out.println("Employee's Salary is : " + e2.getsalary());
		System.out.println("Employee's Company is : " + e2.getcompany());
		
		System.out.println("-----------------------------");
		System.out.println("Employee's Name is   : " + e3.getName());
		System.out.println("Employee's Age is    : " + e3.getAge());
		System.out.println("Employee's Title is  : " + e3.gettitle());
		System.out.println("Employee's Salary is : " + e3.getsalary());
		System.out.println("Employee's Company is : " + e3.getcompany());
}}
		