package assignment4;

import java.util.Scanner;

public class Q34ReverseArrayElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = input.nextInt();
		
		int [] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter an element");
			arr[i] = input.nextInt();
		}
		
		System.out.println("Original order:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] +"");
		}
	}
}
