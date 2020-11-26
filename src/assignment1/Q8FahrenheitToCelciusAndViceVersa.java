package assignment1;

import java.util.Scanner;

public class Q8FahrenheitToCelciusAndViceVersa {

	public static void main(String[] args) {
		//Celsius to Fahrenheit c = (5/9) + (f-32)
		//Fahrenheit to Celsius f = (9c/5)+32 
		Scanner temp = new Scanner(System.in);
		double fahrenheit,celsius;
		
		System.out.print("Enter temp in Celsius: ");
		celsius = temp.nextDouble();
		
		System.out.print("Enter temp in Fahrenheit: ");
		fahrenheit = temp.nextDouble();
		
		//we know converting fahrenheit to celsius
		fahrenheit = (9*celsius/5) + 32 ;
		celsius = (5/9) + (fahrenheit -32);
		
		System.out.println(celsius+"C degree in Fahrenheit = "+ fahrenheit+ "degree");
		System.out.println(fahrenheit+"F degree in Celsius = "+ celsius+ "degree");
		
		
		temp.close();
	}

}
