package testing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 1; i < a.length; i++) {
			if (i % 2 == 0) {
				System.out.println("Even " + i);
			} else if (i % 1 == 0) {
				System.out.println("odd" + i);

			}
		}
		
		
		//stream.
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> Evennumber =	(List<Integer>) numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		
		System.out.println(Evennumber);

	}
}