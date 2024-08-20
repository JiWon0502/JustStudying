import java.util.Scanner;
public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료!");
		while (true) {
			System.out.print(">>데이터 입력 => ");
			String text = s.nextLine();
			if(text.equals("exit"))
				break;
		}
		System.out.println("종료합니다!");
		s.close();
		
	}

}
