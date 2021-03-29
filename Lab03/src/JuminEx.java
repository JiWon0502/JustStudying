import java.util.Scanner;
public class JuminEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		byte num = -1;
		short year = 0;
		String gender = "";
		System.out.println("주민번호의 7번째 자리를 입력 : ");
		num = s.nextByte();
		switch(num) {
		case 9:
		case 0:
			year = 1800;
			break;
		case 1:
		case 2:
			year = 1900;
			break;
		case 3:
		case 4:
			year = 2000;
			break;
		default: year = -1;
		}
		if(year != -1) {
			gender = num%2==0 ? "여성" : "남성";
		}
		System.out.println(year+"년대 "+gender+"분입니다!");
		s.close();
		
	}

}
