package assignment1;

import java.util.Scanner;

public class Q5CalculateArea {
	
	public static void main(String[] args) {
		Scanner area = new Scanner (System.in);
		
		final double PI=Math.PI;  //constant variable
		double r, areaOfCircle ;  //variables used to calculate area of a circle 
		
		System.out.println("Enter a value for radius(r)");
		r= area.nextDouble();
		areaOfCircle = PI*r*r;
		System.out.println("Area of a circle is = "+areaOfCircle);
	/****************************************************************************************/	
		double l,w, areaOfRectangle; //variables used to calculate area of a rectangle 
		
		System.out.println("Enter a value for length(l)");
		l= area.nextDouble();
		
		System.out.println("Enter a value for width(w)");
		w= area.nextDouble();
		
		areaOfRectangle = l*w;
		System.out.println("Area of a rectangle= " + areaOfRectangle);
	/****************************************************************************************/	
		double b,h, areaOfTriangle; //variables used to calculate area of a triangle 
		
		System.out.println("Enter a value for base(b)");
		b= area.nextDouble();
		
		System.out.println("Enter a value for height(h)");
		h= area.nextDouble();
		
		areaOfTriangle = (b*h)/2;
		System.out.println("Area of a triangle= " + areaOfTriangle);
		
		
		area.close();
	}
}
