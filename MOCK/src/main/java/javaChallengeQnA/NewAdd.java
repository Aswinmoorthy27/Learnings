package javaChallengeQnA;

public class NewAdd {
	public static void main(String[] args) {
		/*
		 * int num = 456789; int sum = num; while (sum > 9) { int temp = sum; sum = 0;
		 * while (temp > 0) { sum += temp % 10; temp /= 10; } }
		 * System.out.println("Sum of digits until single digit: " + sum);
		 */

		/*
		 * int n = 1, sum = 0, dig = 0; while (n <= 9) { sum = sum + n % 10; n = n / 10;
		 * } System.out.println("Sum of digits:" + sum); while (sum > 0) { dig = dig +
		 * sum % 10; sum = sum / 10; } System.out.println("Sum of digits:" + dig);
		 */

		int n = 123456, sum = 0, dig = 0;
		
		if(n<=9) {
			System.out.println(n);
		}
			else if (n>9) {
				sum = sum + n % 10;
				n = n / 10;
				 } 
		System.out.println("Sum of digits:" + sum);
				 while (sum > 0) { 
					 dig = dig +
				  sum % 10; sum = sum / 10; 
				  } 
				 System.out.println("Sum of digits:" + dig);
				 
				
				
			}
		
	
}
