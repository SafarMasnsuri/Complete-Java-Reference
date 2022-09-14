package basic;

public final class ReturnExample {
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
    }    
	
	static int methodReturningValue()
    {
        try
        {
            System.out.println("Try block");
            System.out.println(10/0); 
            return 15;
            
            
        }
        catch (Exception e)
        {
            System.out.println("catch block"); 
            return 15;
           
        }
        finally
        {
        	System.out.println("Finally block");
        	
        }
	   
    }

}
