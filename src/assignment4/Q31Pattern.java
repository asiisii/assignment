package assignment4;

import java.util.Scanner;

public class Q31Pattern {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter #: ");
		int num = input.nextInt();
		for (int i = 1; i < num; i++) {
			for (int j = 1; j < i; j++) {
				System.out.println(j+" ");
			}System.out.println();
		}input.hasNext();
	}
}
