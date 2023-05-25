package exceptionAndMultiThreading;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try
		{
			int a[]= {10,20,30,450,0};
			int c=a[2]/a[4];
			
			System.out.println("Division is completed "+c);
			System.out.println(a[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Demoninator should be greater than zero"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Index"+e);
		}
		System.out.println("BYE");
	}

}
