package comboAssign27;

public class Functions {
	
	public int q27Product(int num) {     //num 456
		int product = 1;
		while(num!=0) {
			int temp = num % 10;   //temp =6   / 5 / 4
			product *= temp;        //product = 6  /30 / 120
			num /= 10;           //num = 45 / 4 / 0
		}
		return product;
	}
	
	public int q27Sum(int num) {     //num 456
		int sum = 0;
		while(num!=0) {
			int temp = num % 10;   //temp  = 6  / 5 / 4
			sum += temp;        //product  = 6  / 11 / 15
			num /= 10;              //num  = 45 / 4 / 0
		}
		return sum;
	}
	
	
}


