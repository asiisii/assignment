package assignment3;

import java.util.Scanner;

public class Q21NumToDayOfWeek {
	public static void main(String[] args) {
		
		Scanner numToWeek = new Scanner(System.in);
	
		System.out.println("//////////What day do you wanna hangout? //////////////////");
		System.out.println("1.Sunday\n2.Monday\n3.Tuesday\n4.Wednesday\n5.Thursday\n6.Friday\n7.Saturday");
		System.out.print("Select one of the above number to pick a day: ");
		int dateNumber = numToWeek.nextInt();
		
		if(dateNumber==1) {
			System.out.println("See you on Sunday!");
		}else if(dateNumber==2) {
			System.out.println("See you on Monday!");
		}else if(dateNumber==3) {
			System.out.println("See you on Tuesday!");
		}else if(dateNumber==4) {
			System.out.println("See you on Wednesday!");
		}else if(dateNumber==5) {
			System.out.println("See you on Thursday!");
		}else if(dateNumber==6) {
			System.out.println("See you on Friday!");
		}else {
			System.out.println("See you on Saturday");
		}
		
		numToWeek.close();
	}
}
