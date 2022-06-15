package trickyQuestions;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Print1To100WithoutUsingLoop {

	public static void main(String[] args) {
		/*
		 * QUE::: Print the numbers from 1 to 100 without using any loop We can do this
		 * in two ways: 1. recursive function:: The function will be called by itself..
		 * 2. Java Streams
		 */

		// By using recursive function
		printNumber(1);
		printNumber(101, 200);

		// By using Java Streams
		LongStream.range(132, 250).forEach(m -> System.out.println(m)); // Last number will not be printed...
//		IntStream.range(1001, 1101).forEach(e -> System.out.println(e));
	}

	public static void printNumber(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;
			printNumber(num);
		}
	}

	public static void printNumber(int stNum, int endNum) {
		if (stNum <= endNum) {
			System.out.println(stNum);
			stNum++;
			printNumber(stNum, endNum);
		}
	}

}
