package test;

public class Foo {
		public Foo()
		{
			System.out.println("Constructor");
		}
		static{
			System.out.println("Foo.class static Block");
		}
		//instance Block
		{
		   System.out.println("Instance Block..");
		   System.out.println("======================");
		}
		
		
}
