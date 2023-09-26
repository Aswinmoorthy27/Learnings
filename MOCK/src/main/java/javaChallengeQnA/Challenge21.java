package javaChallengeQnA;

public class Challenge21 {

	public static void main(String[] args) {
		int n = 124566;

		String num = "6";

		String str = String.valueOf(n);

		if (str.contains(num)) {
			System.out.println(num);

		} else {
			System.out.println("There is no search number");
		}

	}

}
