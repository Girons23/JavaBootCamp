package sef.FinalTask;

public class Employe extends Person{

	private String company;
	private String title;
	private int salary;
	
	public Employe (){ 
		System.out.println("I'm Employee constructor"); }
	
	
		public String getcompany() {
			return company ;}

			public void setcompany(String company) {
				this.company = company;}
	
	
				public String gettitle() {
					return title;}
	
	
					public void settitle(String title) {
						this.title = title;}
					
					public int getsalary() {
						return salary ;}
				
						public void setsalary(int salary) {
							this.salary = salary;}
				
				
							
	
							
}
