package com.fuctional.interfacee;

@FunctionalInterface
interface A {
	void move();
	//void pre(); // you can declare only one abstract method inside functional interface
}

public class Annoymous { // it will save with $ sign 

	public static void main(String[] args) {
		A a = new A() {

			@Override
			public void move() {
				System.out.println("Overrided Method of Functional interface A");

			}
		};
		a.move();
	}

}
