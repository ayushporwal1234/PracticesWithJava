package collectionFramework;
import java.util.*;

public class ImplementationOfList
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> alt1 = new ArrayDeque<>(5);
		//LinkedList<Integer> alt2 = new LinkedList<>();
		alt1.add(10);
		alt1.add(20);
		alt1.add(30);
		alt1.add(40);
		alt1.add(50);
		alt1.add(60);
		alt1.add(70);
		
		
      Object x = alt1.toString();
	  //alt1.toString();
		System.out.println(x);
	}

}
