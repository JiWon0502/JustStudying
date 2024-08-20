import java.util.Random;
public class LottoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int lucky = rand.nextInt(10);
		System.out.println("오늘의 행운의 번호는 "+lucky+"입니다!");
	}

}
