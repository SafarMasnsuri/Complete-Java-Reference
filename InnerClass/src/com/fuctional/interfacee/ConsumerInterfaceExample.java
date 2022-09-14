package com.fuctional.interfacee;

import java.util.function.Consumer;



public class ConsumerInterfaceExample {

	public static void main(String[] args) {
		Consumer<String> str = x -> System.out.println(x);
		
		str.accept("safar");
		
	Consumer<String> str1 = x -> System.out.println(x);
		
		str1.accept("Ronak");

	}

}
