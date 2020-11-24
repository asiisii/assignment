package assignment1;

import java.util.Scanner;

public class Q9LbsToKg {

	public static void main(String[] args) {
		Scanner weight = new Scanner(System.in);
		double lbs,kg;
		//we know 1lb = 0.454kg
		System.out.print("Enter a number of pounds: ");
		lbs = weight.nextDouble();
		
		kg = lbs*0.454;
		System.out.println(lbs+"lbs is "+kg+"kg");
		
		
		weight.close();
	}

}
