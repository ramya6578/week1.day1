package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int range = 8;
		int firstNumber = 0;
		int secondNumber =1;
		
		System.out.println(firstNumber);
		
		for (int i = 1; i <= range; i++) {
			
			
			int	sum = firstNumber+secondNumber; 
				firstNumber = secondNumber;
				secondNumber = sum;
				System.out.println(sum);
		

	}
	}
}
