package oops;

public class rectangle 
{
	public double length;
	public double breadth;
	
	public double area()
	{
		return length * breadth;
	}
	
	public double perimeter() 
	{
		return 2*(length*breadth);
	}
	public boolean isSquare()
	{
		if (length == breadth)
		return true ;
		else
			return false;
	}
 

       public static void main(String[] args) 
	{	// TODO Auto-generated method stub
		
		rectangle r = new rectangle();
		r.length = 10.5;
		r.breadth = 10.5;
		
		System.out.println("Area "+r.area());
		System.out.println("Perimeter "+r.perimeter());
		System.out.println("IS it a Square "+r.isSquare());

	}
}

