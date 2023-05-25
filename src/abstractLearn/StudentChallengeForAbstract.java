package abstractLearn;


// Abstract Class are used to setup standards for   sub classes;

abstract class Shape
{
	public double radius;
	abstract double perimeter();
	abstract double area();
	
}

class CircleA extends Shape
{
	
	//@Override
	
	double perimeter() {
	return 2 * Math.PI * radius;
	}
	 
	double area()
	{
		return Math.PI * radius * radius ;
	}
}


public class StudentChallengeForAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s = new CircleA();
		s.radius = 5;
		System.out.println(s.area());
		System.out.println(s.perimeter());
	}

}
