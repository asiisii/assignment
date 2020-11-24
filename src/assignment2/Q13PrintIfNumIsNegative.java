package assignment2;

import java.util.Scanner;

public class Q13PrintIfNumIsNegative {

	public static void main(String[] args) {
		
		double negativeNum = 0;
		
		Scanner negNum = new Scanner (System.in);
		
		System.out.println("Enter a negative number");
		negativeNum = negNum.nextInt();
		while(!(negativeNum<0)) {
			System.out.println("That's not a negative number. Enter a negative number!");
			negativeNum=negNum.nextInt();
		}
		System.out.println("You have entered: "+negativeNum);
		
		negNum.close();

	}	
}
