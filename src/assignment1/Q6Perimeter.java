package assignment1;

import java.util.Scanner;

public class Q6Perimeter {

	public static void main(String[] args) {
		Scanner parameter = new Scanner (System.in);
		
		double pi=3.14, r, parameterOfCircle ;  //variables used to calculate parameter of a circle 
		
		System.out.println("Enter a value for radius(r)");
		r= parameter.nextDouble();
		parameterOfCircle = 2*pi*r;
		System.out.println("Area of a circle is = "+ parameterOfCircle);
	/****************************************************************************************/	
		double l,w, parameterOfRectangle; //variables used to calculate parameter of a rectangle
		
		System.out.println("Enter a value for length(l)");
		l= parameter.nextDouble();
		
		System.out.println("Enter a value for width(w)");
		w= parameter.nextDouble();
		
		parameterOfRectangle = 2*(l+w);
		System.out.println("Area of a rectangle= " + parameterOfRectangle);
	/****************************************************************************************/	
		double a,b,c, parameterOfTriangle; //variables used to calculate parameter of a triangle 
		
		System.out.println("Enter a value for left side of a triangle(a): ");
		a = parameter.nextDouble();
		
		System.out.println("Enter a value for right side of a triangle(b): ");
		b = parameter.nextDouble();
		
		System.out.println("Enter a value for base of a triangle(c): ");
		c = parameter.nextDouble();
		
		parameterOfTriangle = a+b+c;
		System.out.println("Area of a triangle= " + parameterOfTriangle);

		
		parameter.close();
	}

}
