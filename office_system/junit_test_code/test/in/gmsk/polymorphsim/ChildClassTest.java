package in.gmsk.polymorphsim;

import org.junit.jupiter.api.Test;

class ChildClassTest {

	private String inputMessage = "Karan";

	@Test
	void test() {
		
		 /**
		  *  parent class reference name hold object or any sub class(child class) of parent class
		  *  this technique dynamic method dispatch
		  */
		
		ParentClass obj1 = new ChildClass();
		obj1.message(inputMessage );
		obj1.dis();
	}

}
