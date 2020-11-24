package assignment3;

import java.util.Scanner;

public class Q24FactorialNum {
	
	
	public static void main(String[] args) {
		//factorial number of given numbers 
		// n = n*(n-1)*(n-2)*(n-3)
		
		int total = 1;
		Scanner factorialNum = new Scanner(System.in);
		System.out.print("Please enter a number to find the factoiral of: ");
		int num = factorialNum.nextInt();
		
		for(int i=1; i<=num; i++ ) {
			total = total*i;	
		}
		System.out.println("Factorial of "+num+" is "+total);
		
		factorialNum.close();
			
	}
}
