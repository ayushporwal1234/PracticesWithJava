package abstractLearn;

interface member
{
	public void callback();
}
 
class Store
{
	member mem [] = new member[100];
	int count = 0;
	
	void register (member m)
	{
		mem[count ++] = m;
		CountValue();
	}
	
	void invitedSale()
	{
		for(int i = 0; i < count; i++)
		{
			mem[i].callback();
		}
	}
	void CountValue()
	{
		System.out.println("The Space are occupied "+count);
	}
}

class customer implements member
{
	String name ;
	customer(String n)
	{
		name = n;
	}
	public void callback()
	{
		System.out.println( name+" say ok i will visited " );
	}
}

public class InterfaceChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Store s1 = new Store();
			customer c1 = new customer("Jhon");
			customer c2 = new customer("Ayush");
			s1.register(c1);
			s1.register(c2);
			s1.invitedSale();

	}

}
