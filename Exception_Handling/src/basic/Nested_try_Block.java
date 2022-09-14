package basic;

public class Nested_try_Block {

	public static void main(String[] args) {

		try {
			String x = "safart";
			System.out.println(x.length());
			// inner try started from here
			try {
				String y = null;
				System.out.println(y.length());
				System.out.println(y);
			} catch (Exception e) {
				System.err.println("Inner catch");
				e.printStackTrace();
			}

		} catch (NullPointerException e) {
			System.err.println("outer catch");
			e.printStackTrace();
		}

	}

}
