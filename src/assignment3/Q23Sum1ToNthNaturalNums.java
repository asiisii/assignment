package assignment3;

import java.util.Scanner;

public class Q23Sum1ToNthNaturalNums {
	public static void main(String[] args) {
		
		Scanner naturalNum = new Scanner(System.in);
		
		System.out.println("Sum 1 to 20th natural numbers");
		int num = 1; int nthNaturalNum = 50; int totalSum = 0;
		
		while(num<=nthNaturalNum) {
			totalSum+=num;
			num++;
		}
		System.out.println("The total sum from 1 to 50th natural number is: "+totalSum);
		
		naturalNum.close();
		
	}
	
}
