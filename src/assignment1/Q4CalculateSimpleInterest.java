package assignment1;

import java.util.Scanner;

public class Q4CalculateSimpleInterest {

	public static void main(String[] args) {
		Scanner calculateInterest = new Scanner (System.in);
		double P,T,R,Interest;
		
		System.out.println("Please enter a value for Principal(P): " );
		P = calculateInterest.nextDouble();
		
		System.out.println("Please enter a value for Time(T): " );
		T = calculateInterest.nextDouble();
		
		System.out.println("Please enter a value for Rate(R): " );
		R = calculateInterest.nextDouble();
		
		Interest = (P*T*R)/100;
		System.out.println("The Interst=" + Interest);
		
		calculateInterest.close();
	}

}
