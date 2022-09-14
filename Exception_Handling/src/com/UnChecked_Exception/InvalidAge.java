package com.UnChecked_Exception;

import java.util.Scanner;

public class InvalidAge extends RuntimeException {   //Unchecked Exception
	public InvalidAge() {

	}

	public InvalidAge(String msg) {
		super(msg);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		int a = s.nextInt();

		if (a < 18) {
			
			throw new InvalidAge("Pehle 18 ka hoja mera bhai fir vote dena ok mera bhai...");
		} else {
			System.out.println("Welcome to vote meri jaan...");
		}

	}

}
