import java.util.Scanner;
public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("정수 5개 입력: ");
		int sum = 0;
		
		for(int i = 0; i<5; i++) {
			int n = s.nextInt();
			
			if(n<=0)
				continue;
			else 
				sum+=n;
		}
		System.out.println("양수의 sum = "+sum);
		s.close();
	}

}
