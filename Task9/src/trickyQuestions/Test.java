package trickyQuestions;

public class Test {

	public static void main(String[] args) {

		System.out.println(Main.a); // WHEN VARIABLE 'a' IS FINAL, THEN CLASS IS NOT CALLED, SO STATIC BLOCK WILL
									// NOT BE EXECUTED

//					OR

		Main m = new Main();
		System.out.println(m.a); // WHEN WE CALL WITH AN OBJECT THEN CLASS IS CALLED, SO STATIC BLOCK WILL BE
									// EXECUTED FIRST

	}

}

class Main {

	public static final int a = 10;

	static {

		System.out.println("static block");
	}
}
