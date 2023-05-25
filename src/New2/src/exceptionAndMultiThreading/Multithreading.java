package exceptionAndMultiThreading;

public class Multithreading extends Thread {
	
	public void run() 
	{
		for(int i =0;i<10;i++)
		{
			System.out.println(i+".Hello");
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Multithreading t = new Multithreading();
		t.start();
		
		for(int i = 0;i<10;i++)
		{
			System.out.println(i+"World!");
		}
		
	}		
}
