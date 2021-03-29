import java.util.Scanner;
public class CofeeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("무슨 커피를 주문하시겠습니까?");
		String order = s.next();
		
		int price = 0;
		
		switch (order) {
		case "에스프레소" :
		case "카푸치노" :
		case "카페라떼":
			price = 3500; break;
		case "아메리카노" :
			price = 2000; break;
		default : System.out.println("메뉴에 없습니다!");
		}
		if(price!=0) System.out.println(order+ "는 "+ price+"원입니다!");
		s.close();
	}

}
