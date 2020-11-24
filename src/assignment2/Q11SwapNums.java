package assignment2;

public class Q11SwapNums {

	public static void main(String[] args) {
		int x = 5, y = 10;
		System.out.println("Before swapping numbers");
		System.out.println("x = "+x+" and y = "+y);
		
		//a using temporary variable
		int z = x;
		x = y;
		y = z;
		
		System.out.println("After swapping numbers using temporary variable");
		System.out.println("x = "+x+" and y = "+y);
		
		//b without using temporary variable
		int a = 5 , b = 10;
		System.out.println("Before swapping numbers");
		System.out.println("a = "+a+" and b = "+b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping numbers WIHTOUT using temporary variable");
		System.out.println("a = "+a+" and b = "+b);
	}

}
