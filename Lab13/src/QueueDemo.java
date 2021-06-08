import java.util.Queue;
import java.util.LinkedList;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
		queue.offer("Grape");
		queue.offer("Kiwi");
		queue.offer("Mango");
		
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}
