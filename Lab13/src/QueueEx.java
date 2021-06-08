import java.util.LinkedList;
import java.util.Queue;
public class QueueEx {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message> ();
		
		messageQueue.offer(new Message("sendMail", "김이화"));
		messageQueue.offer(new Message("sendSMS", "BTS"));
		messageQueue.offer(new Message("sendKakaotalk", "펭수"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to + "님에게 메일을 보냅니다!");
				break;
			case "sendSMS" :
				System.out.println(message.to + "님에게 SMS을 보냅니다!");
				break;
			case "sendKakaotalk" :
				System.out.println(message.to + "님에게 카카오톡을 보냅니다!");
				break;
			}
		}
	}

}
