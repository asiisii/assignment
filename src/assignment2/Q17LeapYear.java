package assignment2;

import java.util.Scanner;

public class Q17LeapYear {
	public static void main(String[] args) {
		//Step 1. if Year is evenly divisible by 4,   go to step 2. Otherwise, go to step 5.
		//Step 2. if Year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
		//Step 3. if Year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
		//Step 4. The year is a leap year.
		//Step 5. The year is not a leap year.
		
		Scanner leapYear = new Scanner(System.in);
		
		System.out.println("Enter a year to determine whether a year is a leap year or not: ");
		int year = leapYear.nextInt();
		
		if(year%4==0 && year%100==0 && year%400==0) {
			System.out.println(year+" is a leap year.");
		}else {
			System.out.println(year+" is not a leap year.");
		}
		
		
		
		leapYear.close();
	}
}
