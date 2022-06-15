package trickyQuestions;

public class DivideByZero {

	public static void main(String[] args) {

//		System.out.println(12 / 0);    // Arithmetic exception

		System.out.println(12.0 / 0); // Infinity
		System.out.println(12.123d / 0); // Infinity
		System.out.println(12.65432f / 0); // Infinity

		System.out.println(12 / 0.0); // Infinity
		System.out.println(12.234f / 0.0); // Infinity

//		System.out.println(0 / 0); // Arithmetic exception

		System.out.println(0.0 / 0); // Nan means Not a Number

		System.out.println(0.0 / 0.0); // Nan means Not a Number

	}

}
