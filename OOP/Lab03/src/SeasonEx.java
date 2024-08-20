import java.util.Scanner;
public class SeasonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.println("월(1~12) 입력 : ");
		int month = a.nextInt();
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("Spring!");
			break;
		case 6: case 7: case 8:
			System.out.println("Summer!");
			break;
		case 9: case 10: case 11:
			System.out.println("Autumn!");
			break;
		case 12: case 1: case 2:
			System.out.println("Winter!");
			break;
		default: System.out.println("잘못된 월을 입력하셨습니다!");
		a.close();
		}
	}

}
