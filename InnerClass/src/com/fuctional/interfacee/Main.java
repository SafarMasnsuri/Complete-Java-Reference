package com.fuctional.interfacee;

public class Main {

	public static void main(String[] args) {
		Movable movable = new Movable() {
			
			@Override
			public void prepare() {
				System.out.println("movable's Prepare method.'..");
				
			}
		};
movable.prepare();
	}

}
