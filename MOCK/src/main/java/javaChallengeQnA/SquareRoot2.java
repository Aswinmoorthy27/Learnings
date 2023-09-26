package javaChallengeQnA;

/*Java Challenge (2/20)

Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.



Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
*/public class SquareRoot2 {
	public int squareRoot(int number)

	{
		double y = number / 2;

		double temp = y;

		y = ((number / temp) + temp) / 2;

		while ((temp - y) != 0) {
			temp = y;

			y = ((number / temp) + temp) / 2;

		}
		// typecasting convert double to integer to truncate decimal values

		int square = (int) y;

		return square;

	}

	public static void main(String[] args) {
		SquareRoot2 root = new SquareRoot2();
		// root.squareRoot(number);
		System.out.println("===========================================");
		System.out.println("Squareroot Value of the given number is  ");
		System.out.println("===========================================");

		System.out.println(root.squareRoot(4));
		System.out.println(root.squareRoot(8));

	}

}
