package in.gmsk.string;

import java.security.SecureRandom;

public class ExampleSecureRandom {
	
	public int secureRandomExample() {
		
		SecureRandom secureRandom = new SecureRandom();
		
		int randomInt = secureRandom.nextInt();
		
		return randomInt;
	}
}
