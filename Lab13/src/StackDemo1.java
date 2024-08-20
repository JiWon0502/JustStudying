import java.util.Stack;
public class StackDemo1 {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		if(s.empty()) System.out.println("스택이 비어있다!");
		s.push(1);
		s.push(2);
		s.push(3);
		
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		System.out.println(s);
		
	}
}
