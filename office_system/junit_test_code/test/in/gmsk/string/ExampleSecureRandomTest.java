package in.gmsk.string;

import org.junit.jupiter.api.Test;

class ExampleSecureRandomTest {
	
	private ExampleSecureRandom instance = new ExampleSecureRandom();
	
	@Test
	void testSecureRandomExample() {
		System.out.println(instance.secureRandomExample());
	}

}
