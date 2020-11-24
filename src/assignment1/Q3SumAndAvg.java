package assignment1;

import javax.swing.JOptionPane;

//import java.util.Scanner;

public class Q3SumAndAvg {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Enter a value for x: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Enter a value for y: "));
		int sum = x + y;
		
		JOptionPane.showMessageDialog(null, "Sum of x and y is: " +sum,"YOUR RESULT",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
/*
 * Scanner math = new Scanner(System.in); double x,y,sum,avg;
 * 
 * System.out.print("Enter a value for x: "); x = math.nextDouble();
 * 
 * System.out.print("Enter a value for y: "); y = math.nextDouble();
 * 
 * sum= x+y; System.out.println("Sum of x + y = " + sum);
 * 
 * avg = sum/2; System.out.print("Avg of x and y ((x+y)/2) = "+ avg);
 * 
 * math.close();
 * year = Integer.parseInt(JOptionPane.showInputDialog("Enter a year of the date that you want to predict: "));
 */