import java.util.*;
public class CollectionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String > v = new ArrayList<String>();
		v.add("kiwi");
		v.add("pear");
		v.add("apple");
		v.add("banana");
		
		Collections.sort(v);
		
		for(int i = 0; i<v.size(); i++)
			System.out.print(v.get(i) + " ");
	}

}
