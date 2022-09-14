package test;

class Animal {
	public void animal() {
		System.out.println("sabka baap animal bhai");
	}
}

class Dog extends Animal {
	public void dog() {
		System.out.println("sabka bhai dogg");
	}
}

class cat extends Dog {
	public void Catfish() {
		System.out.println("I am  a cat...");
	}
}

public class MultiLevelExample {

	public static void main(String[] args) {
		System.out.println("MultiLevelExample.main(starts)");
		cat test = new cat();
		test.animal();
		test.dog();
		test.Catfish();
		System.out.println("MultiLevelExample.main(Ended)");

	}

		
}
