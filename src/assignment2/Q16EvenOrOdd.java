package assignment2;

import java.util.Scanner;

public class Q16EvenOrOdd {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Please enter any positive number: ");
		
		double posNum = num.nextDouble();
		
		if(posNum%2==0) {
			System.out.println(posNum+" is an even number.");
		}else {
			System.out.println(posNum+" is an odd number.");
		}
		
		num.close();
	}
}
