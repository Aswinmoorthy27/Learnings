package javaChallengeQnA;

import java.util.ArrayList;
import java.util.List;

/*Given a string array words, 
return an array of all characters that show up in all strings within the words (including duplicates). 
You may return the answer in any order.
		 
Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]*/

public class Program19 {

	public static void main(String[] args) {

		String[] words = { "bella", "label", "roller" };

		int count = 0;
		List<String> stringList = new ArrayList<String>();
		if ((words.length - 1) > 1) {
			String[] split = words[0].split("");

			for (int j = 0; j <= split.length - 1; j++) {
				count = 0;

				for (int i = 0; i <= words.length - 1; i++) {

					if (words[i].contains(split[j])) {
						count++;

					}

				}
				if (count == words.length) {
					stringList.add(split[j]);
				}

			}

		}

		System.out.println(stringList);

	}

}
