package trickyQuestions;

public class MethodOverloadingWithStringAndObject {

	public static void main(String[] args) {

		test("Hello");
//		test(null);         // In case of Object and String type It will call String type specifically, but in case of String & StringBuffer, it will throw compilation error
		// because of ambiguity...

	}

	public static void test(Object str) {

		System.out.println("Object Argument");
	}

	public static void test(String str) {

		System.out.println("String Argument");
	}

	public static void test(StringBuffer str) {

		System.out.println("StringBuffer Argument");
	}
}
