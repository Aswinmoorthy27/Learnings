package javaChallengeQnA;

/*Java Problem (20/20)


Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

The distance between two indices i and j is abs(i - j), where abs is the absolute value function. 

Example 1:

Input: s = "aaab", c = "b"
Output: [3,2,1,0]
*/
public class Program20 {

	public static int[] shortestToChar(String s, char c) {
		int[] answer = new int[s.length()];
		int prev = Integer.MIN_VALUE / 2;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				prev = i;
			}
			answer[i] = i - prev;
		}
		prev = Integer.MAX_VALUE / 2;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == c) {
				prev = i;
				// System.out.println(prev);
			}
			answer[i] = Math.min(answer[i], prev - i);
			System.out.print(answer[i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		Program20.shortestToChar("aaab", 'b');
	}

}
