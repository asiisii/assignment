package assignment2;

import java.util.Scanner;

public class Q19TypesOfTriangle {
	public static void main(String[] args) {
		/* Types of triangle by side 
		 * 1. Equilateral Triangle - all sides equal
		 * 2. Isosceles Triangle - two sides equal
		 * 3. Scalene Triangle - 0 sides equal
		 */
		Scanner sides = new Scanner(System.in);
		
		System.out.println("Program will ask you to enter 3 sides of a triangle.");
		System.out.println("Enter the length of the first side: ");
		float side1 = sides.nextFloat();
		
		System.out.println("Enter the length of the second side: ");
		float side2 = sides.nextFloat();
		
		System.out.println("Enter the length of the third side: ");
		float side3 = sides.nextFloat();
		
		if(side1 == side2 && side1 == side3) {
			System.out.println("This is an Equilateral Triangle!");
		}
		else if(side1 != side2 && side1 != side3 && side2 != side3) {
			System.out.println("This is a Scalene Triangle!");
		}
		else {
			System.out.println("This is an Isosceles Triangle!");
		}
		
		sides.close();
	}
}
