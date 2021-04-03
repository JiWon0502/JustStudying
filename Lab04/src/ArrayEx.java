import java.util.Scanner;
public class ArrayEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int Array[] = new int[5];
		int max = 0, sum = 0;
		
		System.out.println("5개의 숫자 입력!: ");
		for(int i = 0; i<5 ; i++) {
			Array[i]  = s.nextInt();
		}
		for(int i = 0; i < 5; i++) {
			sum += Array[i];
			if(max<Array[i])
				max = Array[i];
		}
		System.out.println("제일 큰수: "+max);
		System.out.println("합계: "+sum);
		s.close();
	}

}
