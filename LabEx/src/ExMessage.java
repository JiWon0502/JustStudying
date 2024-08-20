
public class ExMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 0;
		int result;
		try {
			result = a/b;
		}catch(ArithmeticException e) {
			System.out.print("오류 메시지: ");
			System.out.println(e.getMessage());
		}
	}
}
