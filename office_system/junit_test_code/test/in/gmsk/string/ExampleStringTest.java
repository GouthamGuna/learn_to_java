package in.gmsk.string;

import org.junit.jupiter.api.Test;

class ExampleStringTest {

	private String someString = "Gowtham";

	@Test
	void testReverseString() {
		ExampleString instance = new ExampleString();
		instance.ReverseString(someString );
	}

}
