package in.gmsk.example;

import org.junit.jupiter.api.Test;

class ClassNameHereTest {

	private String infoMessage = "Test message...";
	private String titleBar = "Hello";

	@Test
	void testInfoBox() {
		ClassNameHere classNameHere = new ClassNameHere();
		classNameHere.infoBox(infoMessage, titleBar );
	}

}
