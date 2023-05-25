package learn_inheritance;

public class Cylinder extends Circle
{
	public double height;
	
	public double volume()
	{
		return area() * height; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 new Circle();
		 Cylinder c2 = new Cylinder();
		
		 c2.radius = 9.5;
		 c2.height = 10;
		 
		 System.out.println("Volume "+c2.volume());
		 System.out.println("Arae "+c2.area());
	}
}