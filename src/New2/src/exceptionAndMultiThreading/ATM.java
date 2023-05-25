package exceptionAndMultiThreading;

class ATM1
{
	
 synchronized public void checkBalance(String name)
 {
	 System.out.println(name);
	 try {Thread.sleep(1000);}catch(Exception e) {}
 }
 
 synchronized public void withDraw(String name,int amount)
 {
	 
	 System.out.println(name+" withdrawing");
	 try {Thread.sleep(100);}catch(Exception e) {}
	 System.out.println(amount);
 }
}

class customer extends Thread
{
	ATM1 atm;
	String name;
	int amount;
	customer(String n, ATM1 a,int amt)
	{
		name =n;
		atm =a;
		amount = amt;
	}
	public void useATM()
	{
		atm.checkBalance(name);
		atm.withDraw(name, amount);
	}
	public void run()
	{
		useATM();
	}
}

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 ATM1 atm = new ATM1();
			 customer c1 = new customer("Ayush",atm,100);
			 customer c2 = new customer("Pranjal",atm,100000);
			 c1.start();
			 c2.start();
	}

}
