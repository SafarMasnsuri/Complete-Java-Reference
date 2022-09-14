package basic;

public class ExceptionPropagation {
	public static void main(String[] args) {
		System.out.println("main started!!!");
		try {
			m1();
		} 
		catch (Exception e)
		{
			System.out.println("Handled in main method!!!");
		}
		System.out.println("main Ended!!!");
	}//main ended here

	static void m1() {
		System.out.println("m1 started!!!");
		m2();
		System.out.println("m1 Ended!!!"); // This line will not be executed
	}

	static void m2() {
		System.out.println(10 / 0);
	}

}
