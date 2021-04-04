
public class Exmessage01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 0;
		int result;
		try {
			if(b==0)
				throw new Exception("0으로 나눌 수 없습니다!");
			result = a/b;
		}catch(Exception e) {
			System.out.print("오류 메시지: ");
			System.out.println(e.getMessage());
		}
	}
}
