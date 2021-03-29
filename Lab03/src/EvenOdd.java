import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		num = s.nextInt();
		
		if(num%2 == 0) {
			System.out.println("짝수!!");
		}
		else System.out.println("홀수!!");
		s.close();
	}

}
