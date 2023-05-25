package learn_inheritance;

 class SuperA
 {
	 public void display() 
	 {
	 	System.out.println("Super Class");  
	 }
 }
	
    class SubA extends SuperA
	 {
    	@Override
	 	public void display()
	 	{
	 		System.out.println("sub Class");
	 	}
	 }	

public class LearnOverriding 
{
	 public static void main(String[] args)
	 {
		SuperA  s = new SuperA();
		s.display();
		SubA s1 = new SubA();
		s1.display();
	 }
}	
 

