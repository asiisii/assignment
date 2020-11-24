package assignment3;

import java.util.Scanner;

public class Q20FourFunctionCalculator {
	public static void main(String[] args) {
		
		Scanner calculations = new Scanner(System.in);
		
		double num1 = 0, num2 = 0;
		double addition, subtraction, multiplication, division;
		
		System.out.println("Enter the first number: ");
		num1 = calculations.nextDouble();
		
		System.out.println("Enter the second number: ");
		num2 = calculations.nextDouble();
		
		System.out.println("///////////////////////////////////////////////////////////////////////");
		
		System.out.println("1\t2\t3\t4");
		System.out.println("Addition\tSubtraction\tMultiplication\tDivision");
		System.out.println("Select one of the above number: ");
		int operator = calculations.nextInt();
		
		if(operator ==1) {
			addition = num1 + num2;
			System.out.println("Addition: "+ addition);
		}else if(operator ==2) {
			subtraction = num1 - num2;
			System.out.println("Subtraction: "+ subtraction);
		}else if(operator ==3) {
			multiplication = num1 * num2;
			System.out.println("Multiplication: "+ multiplication);
		}else {
			division = num1 / num2;
			System.out.println("Division: "+division);
		}
		
		calculations.close();
		
	}
}
