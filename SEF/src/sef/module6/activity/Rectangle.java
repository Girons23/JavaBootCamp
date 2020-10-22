package sef.module6.activity;

public class Rectangle extends Shape {

	private double lenght;
	private double breadth;
	
	
	public Rectangle() {

	}
	public Rectangle(double lenght,double breadth) {
		this.lenght = lenght;
		this.breadth = breadth;
		
	}
	
	public double calculateArea(){
	
		double area = lenght * breadth;
		
		return area;
	}	
		
		public double calculatePerimeter(){
			
			double Perimeter = lenght * 2 + breadth * 2;
			return Perimeter;
		}

}