package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((str)->{
			for(int i = 0;i<10;i++) {
				for(int j =1;j<=str.length();j++) {
					System.out.print(str.charAt(str.length()-j));
				}
				System.out.println("");
			}
		}, "mesag");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage(s->{
			for(int i = 0;i<s.length();i++) {
				if(i%2==0) {
					System.out.print(Character.toLowerCase(s.charAt(i)));
				} else {
					System.out.print(Character.toUpperCase(s.charAt(i)));
				}
				
			}
			System.out.println("");
		}, "bozingo");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
