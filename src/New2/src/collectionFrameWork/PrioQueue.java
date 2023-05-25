package collectionFrameWork;
import java.util.*;

class MyCom implements Comparator<Integer>
{
	public int compare(Integer o1, Integer o2)
	{
		if(o1<o2) return 1;
		if(o1>o2) return -1;
		return 0;
	}
}

public class PrioQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> p = new PriorityQueue<>(new MyCom());
		
		p.add(5);
		p.add(10);
		p.add(9);
		p.add(56);
		p.offer(3);
		
		System.out.println(p.peek());
	}

}
