package interfaceProgramming;

public class Runner extends AbstractClass implements InterfaceParent, InterfaceChild {

	Runner(int i) {
		super(i);
		System.out.println("Runner class constructor");
	}

	int s = 20;

	public static void main(String[] args) {

		Runner run = new Runner(20);
		run.display();
		run.test();
		run.abstractPrint();
		run.print();
		InterfaceParent.show();
	}

	@Override
	public void display() {
		int d = 23;
		System.out.println(super.d + d + i +" display method of InterfaceParent");
	}

	@Override
	public void test() {
		int s = 22;
		System.out.println(this.s + s + " test method of InterfaceChild");

	}

	@Override
	protected void abstractPrint() {
		System.out.println("abstractPrint method of AbstractClass");

	}

	private void print() {
		System.out.println("private method of runner class");
	}

}
