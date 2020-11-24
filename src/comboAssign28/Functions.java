package comboAssign28;

public class Functions {
	
	public boolean isPrimeNum(int num) {
		boolean isPrime = true;
		for (int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
	
	public void firstNthPrime (int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrimeNum(i)) {
				System.out.println(i+"");
			}System.out.println("");
		}
	}
	
	public void allPrimeBetween (int start, int end) {
		for (int i = start; i <= end; i++) {
			if (isPrimeNum(i)) {
				System.out.println(i+"");
			}System.out.println();
		}
	}
}
