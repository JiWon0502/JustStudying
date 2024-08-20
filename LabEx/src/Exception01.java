
public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] abc = new int[3];
		try {
			abc[2] = 10/0;
			abc[3] = 1000;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났어요!");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다!");
		}
		finally {
			System.out.println("무조건 실행합니다!");
		}
	}

}
