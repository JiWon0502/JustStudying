import java.util.Scanner;
public class InfoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름 도시 나이 체중 미혼 여부를 빈칸으로 분리하여 입력하세요!");
		Scanner in = new Scanner(System.in);
		
		String name = in.next();
		System.out.println("이름: "+name);
		
		String city = in.next();
		System.out.println("도시: "+city);
		
		int age = in.nextInt();
		System.out.println("나이: "+age);
		
		double weight = in.nextDouble();
		System.out.println("체중: "+weight);
		
		boolean single = in.nextBoolean();
		System.out.println("미혼 여부: "+single);
		
		in.close();
	}

}
