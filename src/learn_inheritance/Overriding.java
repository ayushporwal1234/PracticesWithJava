package learn_inheritance;

class TV
{
	public void switchON() 
	{
		System.out.println("TV IS ON");
	}
	public void  changeChannel()
	{
		System.out.println("TV Channel Changed");
	}
}

class SmartTV extends TV
{
	@Override
	public void switchON() 
	{
		System.out.println("SmartTV IS ON");
	}
	@Override
	public void  changeChannel()
	{
		System.out.println("SmartTV Channel Changed");
	}
}

public class Overriding 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV t = new TV();
		//-t.changeChannel();
		TV s = new SmartTV();
		s.changeChannel();
	}
 
}
