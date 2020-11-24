package assignment4;

import java.util.Scanner;

public class Q36FindDuplicatesArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter an element:");
			arr[i]=input.nextInt();
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[j]+"");
					count++;
				}
			}
		}System.out.println("Dupicate elements:");
		if(count==0) {
			System.out.println("No duplicates found!");
		}
	}
}
