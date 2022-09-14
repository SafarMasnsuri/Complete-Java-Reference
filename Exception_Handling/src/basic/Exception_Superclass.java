package basic;

public class Exception_Superclass {

	public static void main(String[] args) {

		Exception e1 = new ArithmeticException("Not able to devide number by zwro");  //upcasting
		System.out.println(e1);
		Exception e2 = new ArithmeticException();
		System.out.println(e2);
		Exception e3 = new ArrayIndexOutOfBoundsException("Index number is not valid");
		System.err.println(e3);

	}

}
