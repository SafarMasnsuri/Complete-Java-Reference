package com.fuctional.interfacee;

import java.util.function.Predicate;

public class Functional {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i%2 ==0;   //functional interface using lambda expression
		
		System.out.println(p.test(12));
		System.out.println(p.test(13));

	}

}
