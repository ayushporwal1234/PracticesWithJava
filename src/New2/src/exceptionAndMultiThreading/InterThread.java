package exceptionAndMultiThreading;

class MyData1
{
	int value;
	boolean flag = true;
	synchronized public void set(int v) 
	{
		while (flag != true)
			try {wait();}catch(Exception e) {}
		value=v;
		flag = false;
		notify();
	}
	synchronized public int get()
	{
		int x=0;
		while (flag != false)
		try {wait();}catch(Exception e) {}
		x=value;
		flag = true;
		notify();
		return x;
	} 
}

class producer extends Thread
{
	MyData1 data;
	
	public producer(MyData1 d)
	{
		data=d;
	}
	public void run()
	{
		int count = 1;
		while(true)
		{
			data.set(count);
			System.out.println("Produce "+count);
			count++;
		}
	}
}
class consumer extends Thread
{
	 MyData1 data;
	
	 public consumer(MyData1 d)
	 {
		 data=d;
	 }
	 public void run()
		{
			int value;
			while(true)
			{
				value = data.get();
				System.out.println("Consumer "+ value);
			}
}
}


public class InterThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyData1 data = new MyData1();
		
		producer p = new producer (data);
		consumer c = new consumer(data);
		
		p.start();
		c.start();
	}

}
