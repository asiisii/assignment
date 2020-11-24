package comboAssign27;

import java.util.Scanner;

public class Execution {
	
	public static void main(String[] args) {
		Functions obj = new Functions();
		Scanner input = new Scanner(System.in);
		
		System.out.println("*******27(a) Factorial***************");
		System.out.print("Enter digits to find its product: ");
		int num = input.nextInt();
		int product = obj.q27Product(num);
		System.out.println(product);
		
		
		System.out.println("*******27(b) Sum***************");
		System.out.print("Enter digits to find its sum: ");
		num = input.nextInt();
		int sum = obj.q27Sum(num); 
		System.out.println(sum);
		 
		
		
		
		
	
		
		input.close();
	}
}
