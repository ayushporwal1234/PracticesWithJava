package exceptionAndMultiThreading;

public class ThrowsToThrow {
	
	static int area(int l,int b) throws Exception
	{
		if(l<0 || b<0)
			throw new Exception();
		return l*b;
	}
	
	static void meth1() throws Exception
	{
		System.out.println(area(- 10,5)); 
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			
		meth1();
	}

}
