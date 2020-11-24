package assignment1;

import java.util.Scanner;

public class Q7CalculateCylinderVolume {

	public static void main(String[] args) {
		//area = pir^2  | volume = area * length 
		Scanner cylinderVolume = new Scanner(System.in);
		double pi= 3.14, r, area, length, volume;
		
		System.out.println("Enter a value for the radius (r): ");
		r = cylinderVolume.nextDouble();
		
		System.out.println("Enter a value for the length: ");
		length = cylinderVolume.nextDouble();
		
		area = pi * r * r;
		volume = length * area;
		
		System.out.println("The area is: "+ area);
		System.out.println("The volume of a cylinder is: "+ volume);
		
		cylinderVolume.close();
	}

}
