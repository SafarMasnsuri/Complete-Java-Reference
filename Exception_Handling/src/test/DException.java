package test;

import java.util.Scanner;

public class DException extends Exception {     // checked Exception

	public DException(String msg) {
		super(msg);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
	/*	try(s;) // java9
		{*/

		try {

			System.out.println("Enter the StuName:");
			String stuName = s.nextLine();
			System.out.println("Enter the RollNo:");
			String rollNo = s.nextLine();
			if (rollNo.length() != 10)// raise Exception
			{
				DException ob1 = new DException("Enter valid Roll Number");
				throw ob1;   // throwing to the catch
			}

			System.out.println("Enter the branch:");
			String br = s.nextLine().toUpperCase();

			System.out.println("StuName:" + stuName);
			System.out.println("StuRollNo:" + rollNo);
			System.out.println("StuBranch:" + br);

		} // try

		catch (DException e) {
			// System.err.println("Exception Catched " + e);
			System.out.println(e.getMessage());
		} // catch

	//	}//resources close
	}// main

}// class
