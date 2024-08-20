import java.util.Scanner;
public class ReverseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		int i;
		
		System.out.print("문자열을 입력해 주세요!: ");
		str = s.nextLine();
		
		for(i=str.length() -1 ; i>=0; i--) {
			System.out.printf("%c", str.charAt(i));
		}
		System.out.println();
		s.close();
	}

}
