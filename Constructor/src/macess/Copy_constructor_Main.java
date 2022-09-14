package macess;
import test.*;
public class Copy_constructor_Main {

	public static void main(String[] args) {
		System.out.println("Copy_constructor_Main.main(start)");
		Copy_Constructor constructor = new Copy_Constructor();
		System.out.println("Constructor Object Created..");
		constructor.Showdata();
		
		System.out.println("after applying copy constructor");
		
		Copy_Constructor constructor1 = new Copy_Constructor(constructor);
		System.out.println("Constructor1 Object Cretated....");
		constructor1.Showdata();

		System.out.println("Copy_constructor_Main.main(ended)");
	}

}
