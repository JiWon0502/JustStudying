import java.util.*;
public class VectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(2,25);
		
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) 
			System.out.println(it.next());
	}
}
