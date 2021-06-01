import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1001, "김이화");
		h.put(1003, "박이화");
		h.put(1010, "최이화");
		h.put(1004, "한이화");
		
		System.out.println(h.get(1003));
		
		Set<Integer> key = h.keySet();
		Iterator<Integer> it = key.iterator();
	
		System.out.println("===========");
		while(it.hasNext())
			System.out.println(h.get(it.next()));
	}
}
