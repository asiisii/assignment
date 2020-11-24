package assignment3;

import java.util.Scanner;

public class Q22MultiplicationTable {
	public static void main(String[] args) {
		
		Scanner table = new Scanner(System.in);
		
		System.out.print("Enter a number that you wanna see multiplication table of: ");
		int num = table.nextInt();
		
		for(int i=1; i<11; i++) {
			System.out.println(num+"*"+i+"= "+num*i);
		}
		
		table.close();
	}
}
