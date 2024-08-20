
public class SamsungPhone extends PDA implements PhoneInterface {

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("따르릉!");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 왔어요!!");
	}
	public void flash() {
		// TODO Auto-generated method stub
		System.out.println("전화기에 불 켜졌어요!!!");
	}
	public void schedule() {
		System.out.println("일정관리!!!!");
	}
}
