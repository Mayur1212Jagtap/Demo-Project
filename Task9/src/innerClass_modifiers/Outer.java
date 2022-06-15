package innerClass_modifiers;

public class Outer {
	public static void main(String[] args) {

		Outer obj = new Outer();
		obj.display();

		Inner inn = obj.new Inner();
		inn.test();

		Other oth = new Other();
		oth.show();
		oth.print();

	}

	private void display() {
		System.out.println("Outer class display method ");
	}

	class Inner {
		void test() {
			System.out.println("Inner class test method");
		}
	}

	static class Other {
		protected void show() {
			System.out.println("other class Protected method");
		}

		public void print() {
			System.out.println("other class print method");
		}
	}

}
