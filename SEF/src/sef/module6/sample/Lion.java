package sef.module6.sample;

//Lion class implements Moveable interface
public class Lion implements Moveable {

	// implements move() method from the Moveable interface
	public void move(){
		System.out.println("Lions can walk/run");
	}
	public void jump(){
		System.out.println("Lions can jump");
	}
	public void sleep(){
		System.out.println("Lions can sleep");
	}
	
}
