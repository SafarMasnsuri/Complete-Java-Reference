package test;

class Salim {
	public void salim() {
		System.out.println("Kon hai bee!!!");

	}
}

class Salman extends Salim {
	public void salman() {
		System.out.println("hii i am salman tera baap hai mai");
	}
}

class Arbaaz extends Salman {
	public void arbas() {
		System.out.println("Aee salman tera bhi Baap hai mai...");
	}
}

public class Hybrid {

	public static void main(String[] args) {
		System.out.println("Hybrid.main(Starts)");
		Arbaaz a = new Arbaaz();
		a.arbas();
		a.salman();
		a.salim();
		System.out.println("Hybrid.main(Ended)");

	}

}
