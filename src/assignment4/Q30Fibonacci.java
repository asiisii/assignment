package assignment4;

import java.util.Scanner;

public class Q30Fibonacci {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a num to print the Fibonacci series till: ");
		int num = input.nextInt();
		int first= 1;
		int second=1;
		
        System.out.print(first+" ");

        for (int i = 1; i <= num; i++) {
			System.out.println(second+" ");
			int temp =first +second;
			first = second;
			second = temp;
		}
        
        input.close();
	}	
}
