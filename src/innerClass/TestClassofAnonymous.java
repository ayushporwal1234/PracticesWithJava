package innerClass;


abstract class My
{
	abstract void display();
}

class Outer
{
  public static void meth() 
{
	My m = new My()
{
		public void display()
		{
			System.out.println("Hello");
		}
};
	m.display();
}
}
public class TestClassofAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer o = new Outer();
		System.out.println(o);
}
}
