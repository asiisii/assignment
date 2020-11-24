package assignment2;

import java.util.Scanner;

public class Q18LargestValue {
	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		
		double value1, value2, value3;
		System.out.println("Program will ask you to enter 3 different value!");
		System.out.print("Please enter the first value: ");
		value1 = value.nextDouble();
		
		System.out.print("Please enter the second value: ");
		value2 = value.nextDouble();
		
		System.out.print("Please enter the third value: ");
		value3 = value.nextDouble();
		
		if(value1>value2 && value1>value3) {
			System.out.println("First value "+value1+" is the largest number");
		}
		else if(value2>value1 && value2>value3) {
			System.out.println("Second value "+value2+" is the largest number");
		}
		else {
			System.out.println("Third value "+value3+" is the largest number");
		}
		
		value.close();
	}
}
