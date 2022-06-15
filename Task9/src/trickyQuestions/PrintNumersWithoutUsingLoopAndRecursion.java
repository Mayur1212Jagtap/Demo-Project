package trickyQuestions;

import java.util.Arrays;
import java.util.BitSet;

public class PrintNumersWithoutUsingLoopAndRecursion {

	public static void main(String[] args) {

		// 1. Arrays.fill method
		Object[] arr = new Object[100];

		Arrays.fill(arr, new Object() {

			int count = 0;

			@Override
			public String toString() {
				return Integer.toString(++count);
			}

		});

		System.out.println(Arrays.toString(arr));

		// 2. Using BitSet

		String str = new BitSet() {
			{

				set(1, 100);

			}
		}.toString();

		System.out.println(str);

	}

}
