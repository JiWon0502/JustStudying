import java.util.Scanner;
public class CarEx02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("사용자 데이터 입력! ");
		System.out.print("이름: " ); String name = s.next();
		System.out.print("너비: " ); int width = s.nextInt();
		System.out.print("높이: " ); int height = s.nextInt();
		System.out.print("깊이: " ); int length  = s.nextInt();
		System.out.print("연료량: " ); double fuel  = s.nextDouble();
		
		Car myCar = new Car(name, width, height, length, fuel);
		
		while(true) {
			System.out.println("현재위치("+myCar.getX()+","+myCar.getY()+") 남은 연료"+myCar.getFuel());
			System.out.print("이동?[0:No, 1:Yes]: ");
			if(s.nextInt() == 0) break;
			System.out.print("x방향의 이동거리: ");
			double dx = s.nextDouble();
			System.out.print("y방향의 이동거리: ");
			double dy = s.nextDouble();
			
			if(!myCar.move(dx, dy)) System.out.println("연료 부족!!");
		}
		s.close();
	}

}
