package basic;

import java.util.Scanner;

public class Halt_middel {

	public static void main(String[] args) {
		try {
			System.out.println("Halt_middel.main(Started)");
			Scanner s = new Scanner(System.in);
			int a = 10;
			System.out.println("Enter a number");
			int b = s.nextInt();
			int c = a / b;
			System.out.println("DIvision is:-" + c);
			System.out.println("Halt_middel.main(ended..)");
		} catch (Exception e) {
			System.err.println("Exception Catched....Please provide number other than zero...");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} // end of catch
		System.out.println("Program completed");

	}

}
