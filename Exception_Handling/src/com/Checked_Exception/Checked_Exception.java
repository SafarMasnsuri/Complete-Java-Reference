package com.Checked_Exception;

import java.util.Scanner;

public class Checked_Exception extends Exception { // Checked Exception

	public Checked_Exception() {

	}

	public Checked_Exception(String msg) {
		super(msg);
	}

	public static void main(String[] args) throws Checked_Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a age");
		int a = scanner.nextInt();

		if (a < 18)
			throw new Checked_Exception("Pehle 18 ka ho jaa meri jaan fir vote dena...");
		else
			System.err.println("welcome to vote....");

	}
}
