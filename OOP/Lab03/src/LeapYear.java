import java.util.Scanner;
public class LeapYear {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int year;
		
		System.out.println("연도 입력: ");
		year = s.nextInt();
		if(((year%4==0) && (year%100 != 0)) || (year%400 == 0))
			System.out.printf("%d 년은 윤년!\n", year);
		else
			System.out.printf("%d 년은 평년!\n", year);
		s.close();
	}

}
