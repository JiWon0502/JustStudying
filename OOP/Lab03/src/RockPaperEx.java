import java.util.Scanner;

public class RockPaperEx {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2)를 선택하세요: ");
		int user = s.nextInt();
		int computer = (int)(Math.random()*3);
		
		if(user == 0) System.out.print("가위");
		else if(user == 1) System.out.print("바위");
		System.out.print("보");
		
		if(computer == 0) System.out.println(": 가위");
		else if(computer == 1) System.out.println(": 바위");
		System.out.println(": 보");
		
		if(user == computer) System.out.println("비겼네요!");
		else if(user == (computer+1)%3) System.out.println("이겼네요!");
		else System.out.println("안타깝게 지셨군요!");
		
		s.close();
	}

}
