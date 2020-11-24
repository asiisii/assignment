package assignment2;

import java.util.Scanner;

public class Q12DisplayProvidedValues {

	public static void main(String[] args) {
		Scanner display = new Scanner(System.in);
/////////////ROLL section /////////////////////////////////////////////////////		
		int age = 0;

		boolean isInteger=true; 
		

		do {
			System.out.print("Enter your age: ");
			if (display.hasNextInt()) {
				age = display.nextInt();
				isInteger = true;
			} else {
				System.out.println("Invalid number!! Please enter a proper age!");
				isInteger = false;
				display.next();
			} 
		} while (!isInteger);
		display.nextLine();
//////////////////////NAME section //////////////////////////////////////////				
		System.out.print("Enter your name: ");
		String name = display.nextLine();
		while(!name.matches("[a-zA-Z]+")){
		    System.out.println("Please enter a valid name!");
		    name = display.nextLine();
		}
	
//////////////////////Nationality section //////////////////////////////////////////
		System.out.print("Enter your nationality: ");
		String nationality = display.nextLine();
		while(!nationality.matches("[a-zA-Z]+")){
		    System.out.println("Please enter a valid nationality!");
		    nationality = display.nextLine();
		}
		System.out.println("///////////////////////////////////////////////////////////////////////");
		System.out.println("About you");
		System.out.println("Name\tAge\tNationality");
		System.out.println(name+"\t"+age+"\t"+nationality);
		display.close();
	}

}
