package collectionFrameWork;
import java.util.*;
import java.util.Map.*;

public class TreeMapDemo {

	/*TreeMap implemented RedBlack Tree
	 * Tree takes  O(log n) time for all basics operation 
	 * Hash takes  O(1) time for all basics operation 
	 * Tree possess sorted element 
	 * Hash possess unsorted element 
	 */

	public static void main(String[] args) {
 
		TreeMap<Integer,String> tm = new TreeMap<>(Map.of(1,"A",2,"B",3,"C"));
		HashMap<Integer,String> hm = new HashMap<>(Map.of(1,"A",2,"B",3,"C"));
			tm.put(4,"d");
			System.out.println(tm);
			System.out.println(hm);
			System.out.println(tm.get(1));
			
			Entry<Integer,String> e = tm.firstEntry();
			System.out.println(e.getKey()+" "+e.getValue());
	}
}
