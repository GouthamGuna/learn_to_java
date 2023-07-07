package in.gmsk.polymorphsim;

public class ChildClass extends ParentClass{

	public void message(String name) {
		System.out.println("Welcome to "+name+" Child Class");
	}
	
	public void show() {
		System.out.println("Parent Class dis()");
	}

}
