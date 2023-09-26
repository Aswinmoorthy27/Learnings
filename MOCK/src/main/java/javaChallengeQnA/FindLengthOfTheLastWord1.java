package javaChallengeQnA;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*Java Challenge (1/20)
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
 
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.*/

public class FindLengthOfTheLastWord1 {

//	@Test(dataProvider = "Fetch")
//	public void findTheLength(String data) {
//		
		
	
	public static void main(String[] args) {
		
	
		String data="luffy is still joyboy";
		String[] splitArray = data.split(" ");

		//System.out.println(Arrays.toString(splitArray));
		List<String> listString = Arrays.asList(splitArray);
		String string = listString.get(listString.size() - 1);
		int length = string.length();
		System.out.println("The Length of the last word " + data + " is----> " + length);

	}
	
	  @DataProvider(name="Fetch") public String[][] data() { String [][] value= new
	  String[3][0]; value[0][0]="Hello World"; value[1][0]="fly me to the moon";
	  value[2][0]="luffy is still joyboy";
	  
	  return value; }
	 
	
 

		


}