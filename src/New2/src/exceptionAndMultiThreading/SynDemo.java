package exceptionAndMultiThreading;


class myData
{
	public  void display(String str)
{
		synchronized(this)
	{
		for(int i =0;i<str.length();i++)
		{
			System.out.print(" "+str.charAt(i));
			try {Thread.sleep(100);}catch(Exception e) {}
		}
	}
}
}	

class myThread3 extends Thread
{
	myData d;
	public myThread3(myData d)
	{
		this.d=d;
	}
	
	public void run()
	{
		d.display("Ayush");
	}
}

class myThread2 extends Thread
{
	myData d;
	public myThread2(myData d)
	{
		this.d=d;
	}
	
	public void run()
	{
		d.display("Porwal");
	}
}

public class SynDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myData data = new myData();
		myThread3 t1 = new myThread3(data);
		myThread2 t2 = new myThread2(data);
		t1.start();
		t2.start();
	}

}
