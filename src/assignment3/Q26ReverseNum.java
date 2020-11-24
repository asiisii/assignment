package assignment3;

public class Q26ReverseNum {
	public static void main(String[] args) {
		int reverse=0;
		int originalNum = 123;
		while(originalNum!=0) {
			
			int remainder = originalNum % 10;
			reverse =reverse * 10 + remainder;
			originalNum /=10;
			
			
		}
		System.out.println("123 after reversed is: "+reverse);
}
}
