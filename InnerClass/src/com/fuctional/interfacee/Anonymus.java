package com.fuctional.interfacee;

public class Anonymus {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Method running....");

			}
		};
		runnable.run();
	}
}
