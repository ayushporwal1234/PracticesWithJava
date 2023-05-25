package exceptionAndMultiThreading;

 class MyThread1 extends Thread
{
	public MyThread1(String name)
	{
		super(name);
		System.out.println(name);
	}
}
public class ThreadMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 t = new MyThread1("myThread3");
			System.out.println(t.getId());
			System.out.println(t.getPriority());
			System.out.println(t.getState());
			System.out.println(t.isAlive());
			
	}

}
