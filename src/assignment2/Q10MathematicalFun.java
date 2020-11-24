package assignment2;

import java.util.Scanner;

public class Q10MathematicalFun {

	public static void main(String[] args) {
		Scanner mathFun = new Scanner(System.in);
		
		/* s = ut + 0.5 at^2
		 * area = (s(s-a)(s-b)(s-c))^(1/2)
		 * x = (-b+(b*b-4ac)^(1/2))/2a
		 * */
		
		double s, u, t, a , area, s2, a2, b, c, x, b2, a3, c2;
		System.out.print("Enter a value for u to find s: ");
		u = mathFun.nextDouble();
		System.out.print("Enter a value for t to find s: ");
		t = mathFun.nextDouble();
		System.out.print("Enter a value for a to find s: ");
		a = mathFun.nextDouble();
		
		s = (u*t) + (0.5 * a *Math.pow(t, 2));
		System.out.println("S is: ");
		///////////////////////////////////////////////////////////////////////////////////
		
		System.out.print("Enter a value for s to find area: ");
		s2 = mathFun.nextDouble();
		System.out.print("Enter a value for a to find area: ");
		a2 = mathFun.nextDouble();
		System.out.print("Enter a value for b to find area: ");
		b = mathFun.nextDouble();
		System.out.print("Enter a value for c to find area: ");
		c = mathFun.nextDouble();
		
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area is: ");
		//////////////////////////////////////////////////////////////////////////////////
		
		System.out.print("Enter a value for b to find x: ");
		b2 = mathFun.nextDouble();
		System.out.print("Enter a value for a to find x: ");
		a3 = mathFun.nextDouble();
		System.out.print("Enter a value for c to find x: ");
		c2 = mathFun.nextDouble();
		
		x = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		System.out.println("X is: ");
		
		mathFun.close();
	}

}
