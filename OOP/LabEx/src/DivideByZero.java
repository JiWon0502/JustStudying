import java.util.Scanner;
public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int dividend, divisor;
		System.out.println("나뉨수 입력: ");
		dividend = s.nextInt();
		System.out.println("나눔수를 입력: ");
		divisor = s.nextInt();
		
		try {
			System.out.println(dividend +"를 "+divisor+"로 나누면 몫은 "+dividend/divisor + "입니다.");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다!");
		}
		s.close();
	}
}
