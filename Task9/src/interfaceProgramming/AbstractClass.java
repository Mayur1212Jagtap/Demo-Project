package interfaceProgramming;

public abstract class AbstractClass implements InterfaceParent {
	
	AbstractClass (int i){
		int j = i + 15;
		System.out.println(j+" Abstract class constructor");
	}
	
	
	int d = 45;
	
	protected abstract void abstractPrint();
}
