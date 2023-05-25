package learn_inheritance;

class SupeR12
{
	public void meth1()
	{
		System.out.println("Super Meth 1");
	}
	
	public void meth2()
	{
		System.out.println("Super Meth2");
	}
}
	class SuB extends SupeR12
	{
		@Override
		public void meth2()
		{
			System.out.println("Sub Meth2");
		}
		public void meth3()
		{
			System.out.println("Sub meth3");
		}
	}

public class DynamicDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// refercen always be parent and object is always sub classes
		SuB s = new SuB();  
		s.meth2();
		s.meth1();
	}

}
