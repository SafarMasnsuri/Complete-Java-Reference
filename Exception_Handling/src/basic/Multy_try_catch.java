package basic;

public class Multy_try_catch {

	public static void main(String[] args) {
		System.out.println("Main Method Started..");
		try {
			int a[] = { 12, 23, 44, 55 };
			System.out.println(a[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Please  provide valid index number..");
			e.printStackTrace();
		}
		// first try

		try {
			int a = 10, b = 0, c;
			c = a / b;
			System.out.println("c value is" + c);
		} catch (ArithmeticException e) {
			System.err.println("Please replase the zero with other than zero value...");
			e.printStackTrace();
		}
		// Second try
		System.out.println("Multy_try_catch.main(Ended..)");
	}

}
