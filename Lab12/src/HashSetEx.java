import java.util.HashSet;
import java.util.Iterator;
public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("red");
		set.add("yellow");
		set.add("blue");
		set.add("green");
		set.add("black");
		System.out.println(set);
		System.out.println("element 개수: "+ set.size());
		System.out.println();
		set.add("white");
		Iterator<String> it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("element 개수: "+ set.size());
	}
}
