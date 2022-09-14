package test;

public class Parameterized_Constructor {
		int roll_number;
		String name;
		String address;
		static String college_Name = "kadi College";
		
		
		public Parameterized_Constructor(int roll_number, String name, String address) {
			System.out.println("Parameterized_Constructor(Executed)");
			
			this.roll_number = roll_number;
			this.name = name;
			this.address = address;
		}

		@Override
		public String toString() {
			System.out.println("Parameterized_Constructor.toString(Executed)");
			return "Parameterized_Constructor [roll_number=" + roll_number + ", name=" + name + ", address=" + address
					+ "]";
		}
		
		
		
}
