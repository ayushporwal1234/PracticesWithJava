package methodByAbdulSir;

public class MethodOverloading {
	
	/*In method overloading method same may be similar 
	but the return type or input parameter is different.
	*/
	static double areas(double length , double breadth) {
	 return length * breadth ;
	
	}
	static double areas(double radius) {
		 return Math.PI * radius * radius;
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areas(5));
		System.out.println(areas(25,51));
	}

}
