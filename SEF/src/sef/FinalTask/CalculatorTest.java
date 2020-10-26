package sef.FinalTask;

import sef.module4.activity.Calculator;

public class CalculatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);
		
		System.out.println("*** Calculations will be performed using "+normalCalc.getCalculatorType()+ " calculator ***");
		
		// Add 
		int result = normalCalc.add (6, 2);
		System.out.println("1) Add result is " + result);
		
				
		// Multiply 
		int[] mul = {7, 8, 9};
		result = normalCalc.multiply(mul);
		System.out.println("2) Multiplication result is " + result); 
		
		// Subtract
				result = normalCalc.subtract(15, 7);
				System.out.println("3) Subtraction between numbers is " + result);

		// Divide
				result = normalCalc.divide(69, 3);
				System.out.println("4) Division of numbers is " + result);
	} 


}
