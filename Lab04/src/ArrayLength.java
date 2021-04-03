import java.util.Scanner;
public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int Array[] = new int[4];
		int sum = 0;
		System.out.println(Array.length + "개의 정수를 입력하세요>> ");
		for(int i = 0; i<Array.length; i++) {
			Array[i] = s.nextInt();
		}
		for(int i = 0; i < Array.length; i++) {
			sum+= Array[i];
		}
		System.out.println("평균: "+ sum/Array.length);
		s.close();
	}

}
