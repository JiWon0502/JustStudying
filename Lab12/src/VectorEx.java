import java.util.*;
public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(2,25);
		
		for(int i = 0; i<v.size(); i++) 
			System.out.println(v.get(i));
		System.out.println();
		
		v.remove(2);

		for(int i = 0; i<v.size(); i++) 
			System.out.println(v.get(i));
	}
}
