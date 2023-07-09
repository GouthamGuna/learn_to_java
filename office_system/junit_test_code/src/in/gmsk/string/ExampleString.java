package in.gmsk.string;

public class ExampleString {

	public void ReverseString(String someString) {
		
		String reverse = "";
		char ch;
		
		for(int i = 0; i < someString.length(); i++) {
			
			ch = someString.charAt(i);
			
			reverse = ch + reverse;
		}
		
		System.out.println("reverse = " + reverse);
	}
}
