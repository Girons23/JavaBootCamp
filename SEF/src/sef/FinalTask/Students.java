package sef.FinalTask;

public class Students extends Person {

	private String school;
	
	
	public String getSchool() {
		return school;
	}
	
	// setter for String school
	public void setSchool(String school) {
		this.school = school;
	}
		public void announce(){
			super.announce();  // calls announce() method of Person class
			System.out.println("I study in university" + school);
}
}