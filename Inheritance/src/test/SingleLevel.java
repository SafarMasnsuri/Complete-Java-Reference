package test;

class Super {
	int x;
	String name;
	static String surname = "Mansuri's";

	public Super(int x, String name) {
		
		this.x = x;
		this.name = name;
	}

	
	public void Showdata() {
		System.out.println("Number is:=" + x);
		System.out.println("name is:=" + name);
		System.out.println("Surname is:=" + surname);
		System.out.println("================================================");
	}

}// end of super

class Sub extends Super {

	int y;
	String fname;
	String lname;

	public Sub(int x, String name, int y, String fname, String lname) {
	    super(x, name);
		this.y = y;
		this.fname = fname;
		this.lname = lname;
	}

	public void Show() {
		System.out.println("NUmber is:=" + y);
		System.out.println("First name is:=" + fname);
		System.out.println("Lastname is:=" + lname);
		System.out.println("=================================");
	}

}// end of sub

public class SingleLevel {

	public static void main(String[] args) {
		System.out.println("SingleLevel.main(Start)");
		Sub test = new Sub(55, "safarBhai", 56, "safarbhai", "Ayubhai");
		test.Showdata();
		test.Show();
		System.out.println("SingleLevel.main(ENd)");

	}

}
