package assignment4;

import java.util.Scanner;

public class Q32ArraySum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = input.nextInt();
		
		int[] arr = new int [size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter an element: ");
			arr[i] = input.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}System.out.println("Sum is: "+sum);
	}
}
