package comboAssign28;

import java.util.Scanner;

public class Execution {
	public static void main(String[] args) {
		Functions obj = new Functions();
		Scanner input = new Scanner(System.in);

		String decision = "";
		do {
			System.out.println("Enter your choice: prime | nthPrime | allPrime");
			String choice = input.next();

			switch (choice) {

			case "prime": {
				System.out.println("Enter num to see if it's a prime num: ");
				int num = input.nextInt();
				boolean isPrime = obj.isPrimeNum(num);
				if (isPrime) {
					System.out.println(num + " it's a prime number");
				} else {
					System.out.println(num + " not a prime number");
				}
				break;
			}

			case "nthPrime": {
				System.out.println("Enter num to find the first nth prime num: ");
				int num = input.nextInt();
				obj.firstNthPrime(num);
				break;
			}

			case "allPrime": {
				System.out.println("From what num do you want to start the prime number search? : ");
				int start = input.nextInt();
				System.out.println("Till what num do you want to search the prime number?");
				int end = input.nextInt();
				obj.allPrimeBetween(start, end);
				break;
			}

			default:
				System.out.println("Wrong Input!");
				break;
			}
			System.out.println("Do you wish to continue? Enter yes || no");
			decision = input.next();
		} while (decision.equalsIgnoreCase("yes"));
		System.out.println("The End");

		input.close();
	}

}
