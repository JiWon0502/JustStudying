import java.util.Stack;
public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		String in = "a b a b c c c # c c c b a b a";
		boolean check = true;
		String p[] = in.split(" ");		
		for(int i = 0; i<(p.length / 2); i++) 
			stack.push(p[i]);
		System.out.println(stack);
		for(int i = (p.length/2+1); i<p.length; i++) {
			String top = stack.pop();
			System.out.println("top: "+ top);
			System.out.printf("-->p[%d]:%s", i,p[i]);
			System.out.println();
			System.out.println(stack);
			if(top.equals(p[i]));
			else {
				check = false;
				break;
			}
		}
		if(check) System.out.println("맞다");
		else System.out.println("틀리다");
	}

}
