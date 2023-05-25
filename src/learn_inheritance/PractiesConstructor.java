package learn_inheritance;

	class Parent
	{
		Parent()
		{
			System.out.println("Non-Param ");
		}
		Parent(int x)
		{
			System.out.println("Param"+x);
		}
	}
	
	class Child extends Parent
	{
		Child()
		{
			System.out.println("Non-Param1");
		}
		Child(int y)
		{
			System.out.println("Param");
		}
		Child(int x,int y)
		{
			super(x);
			System.out.println("2Param"+y);
		}
	}
	
	public class PractiesConstructor {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child(40,50 );

	}

}

