package assignment2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = in.nextLine();
		
		while(!name.matches("[a-zA-Z]+")){
		    System.out.println("Please enter a valid name!");
		    name = in.nextLine();    
		}System.out.println("Your name is "+name);
		
		
		
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		
		while(!in.hasNextInt()) {
			System.out.println("Invalid age!");	
			age = in.nextInt();
		}System.out.println("Your age: "+age);
			
	
		
		in.close();
		
		String[] cars = {"Toyota", "BMW", "Ford"};
		for (String i : cars) {
		  System.out.println(i);
		}
	}
}
