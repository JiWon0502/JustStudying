import java.util.Queue;
import java.util.LinkedList;
public class QueueDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		String in = "a b a b c c c # a b a b c c c";
		boolean check = true;
		String p[] = in.split(" ");		
		for(int i = 0; i<(p.length / 2); i++) 
			queue.offer(p[i]);
		System.out.println(queue);
		for(int i = (p.length/2+1); i<p.length; i++) {
			String front = queue.poll();
			System.out.print("top: "+ front);
			System.out.printf("-->p[%d]:%s\n", i,p[i]);
			if(!(front.equals(p[i]))) {
				check = false;
				break;
			}
		}
		if(check) System.out.println("맞다");
		else System.out.println("틀리다");
	}

}