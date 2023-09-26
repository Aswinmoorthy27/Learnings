package javaChallengeQnA;

public class Challenge22 {

	public static void main(String[] args) {

		String str1 = "abcd";
		char[] ch1 = str1.toCharArray();

		String str2 = "abcdef";
		char[] ch2 = str2.toCharArray();

		for (int i = 0; i < ch1.length; i++) {
			System.out.print(ch1[i]);

			for (int j = 0; j < ch2.length; j++) {
				System.out.print(ch2[j]);

				if (ch1[i] == ch2[j]) {
					System.out.println(ch1[j]);

				}
			}
		}
	}

}
