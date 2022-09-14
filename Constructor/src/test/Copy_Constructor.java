package test;

public class Copy_Constructor {
	String name1;
	String name2;
	
	public Copy_Constructor() {
	    System.out.println("Copy_Constructor.Copy_Constructor(default)");
	    name1 = "safar";
	    name2 = "yatri";
	}
	 public Copy_Constructor(Copy_Constructor c){
		 name1 = c.name2;
		 name2 = c.name1;
		 System.out.println("Copy_Constructor.Copy_Constructor(Copy Constructor)");
		 
	 }
	 public void Showdata() {
		
		 System.out.println("name one is:-"+name1);
		 System.out.println("name two is:-"+name2);
	}
	
	
}
