package oops;

public class Student 
{
	int roll_number;
	String name;
	String course;
	int m1,m2,m3;
	int sum;
	public int total()
	{
		return m1+m2+m3;
	}
	public double average() 
	{
		sum =  m1 + m2 + m3/3;
		return sum;
	}
	public char grade()
	{
		if (sum > 70)
	    	return 'A' ;
		else 
			return 'B' ;
	}
	public String details()
	{
		return "Roll No:"+roll_number+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Student s = new Student();
		s.roll_number = 1;
		s.name ="Ayush";
		s.course = "CSE";
		s.m1 =70;
		s.m2 = 80;
		s.m3 = 70;
		
		System.out.println("Total :" +s.total());
		System.out.println("Average :" +s.average());
		
		System.out.println("Details:\n" +s .details());
	}

}
