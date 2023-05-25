package collectionFrameWork;
import java.util.*;

public class ArrayDEQUE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		
		dq.offerLast(10);
		dq.offerLast(20);
		dq.offerLast(30);
		dq.offerLast(40);
		dq.pollLast();
		dq.offerFirst(1);
		dq.offerFirst(2);
		dq.offerFirst(3);
		dq.offerFirst(4);
		dq.pollFirst();
		
		dq.forEach((x)->System.out.println(x));  //lambda exp.
		
	}

}
