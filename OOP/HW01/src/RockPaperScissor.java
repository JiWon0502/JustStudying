//컴퓨터공학과 2071032 윤지원
import java.util.InputMismatchException;
import java.util.Scanner;

public class RockPaperScissor {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userWin=0, computerWin = 0, gameNum=0;
		Scanner s = new Scanner(System.in);

		//게임을 연속으로 플레이 할 수 있도록 변경
		while(true) {
			printFirst(s); //초기 설명을 매번 출력하게 하는 메소드

			/*잘못 입력받은 경우 다시 입력받도록 하기 위한 메소드 getUser(s)
			0~3 사이의 정수만 return한다.*/
			int user = getUser(s);
			
			if (user == 3) break; //user == 3인 경우 바로 종료하도록 한다.

			int computer = (int)(Math.random()*3); //computer`s must be in random integer from 0~2

			
			//현재 점수, 전체 플레이한 게임 수 저장하도록 변경
			if(user == (computer+2)%3) computerWin++; //컴퓨터가 이긴 횟수
			else if(user == (computer+1)%3) userWin++; //유저가 이긴 횟수
			gameNum++;
			
			//user가 선택한 것과, computer가 선택한 것을 user에게 문자로 출력해서 알려준다.
			printGame(user, computer);

			//현재 점수, 전체 플레이 게임 수를 출력할 수 있도록 변경
			System.out.println("\n___________________________________________________________________________________");
			System.out.println("\nCurrent Score : "+userWin+" vs "+computerWin);
			System.out.println("Current Game number : NO."+gameNum);
			System.out.println("___________________________________________________________________________________\n\n");

		}
		//마지막에 총 점수와 누가 이겼는지를 출력할 수 있도록 변경
		System.out.println("\n___________________________________________________________________________________\n");
		System.out.println("------------------------------------End of Game------------------------------------");
		System.out.println("___________________________________________________________________________________\n");

		System.out.println("You Scored "+userWin +" out of "+gameNum+"!!");
		System.out.println("Computer Scored "+computerWin +" out of "+gameNum+"!!");

		if(userWin > computerWin) System.out.println("\nYou Win!");
		else if(userWin < computerWin) System.out.println("\nYou Lose!!");
		else System.out.println("\nTie!!!");
		
		s.close();
	}
	
	//초기 설명을 출력하는 메소드입니다. 한글 타자가 불편해서 영어로 적힌 것 제외 달라진 것은 거의 없습니다.
	public static void printFirst(Scanner s) {
		System.out.println("***********************************************************************************");
		System.out.println("To End this game : press (3)"); //3을 입력하면 게임이 중단 
		System.out.println("Rock(1), Scissor(0), Paper(2)!"); //rock = 1, scissor = 0, paper = 2로 정해준다.
		System.out.println("***********************************************************************************");
		System.out.println(">>");
	}
	
	//user의 값을 scan하기 위한 메소드입니다. 정상적인 값만 입력 받을 수 있도록 변경하였습니다.
	//only scan & return the integer in the range 0~3
	public static int getUser(Scanner s) { 
		try {
			int n = s.nextInt();
			if(0<=n && n<=3) return n;
			else {
				System.out.println("다시 입력>>");
				return getUser(s);
			}
		}
		catch (InputMismatchException e) {
				System.out.println("다시 입력>>");
				s.nextLine();
				return getUser(s);
		}
	}
	
	//user와 computer의 매 게임 패를 출력해 주는 메소드입니다. 달라진게 거의 없습니다.
	public static void printGame(int user, int computer) {
		if(user == 0) System.out.print("\n가위");
		else if(user == 1) System.out.print("\n바위");
		else System.out.print("\n보");
		
		if(computer == 0) System.out.println(" : 가위");
		else if(computer == 1) System.out.println(" : 바위");
		else System.out.println(" : 보");
		
		if(user == computer) System.out.println("비겼네요!");
		else if(user == (computer+1)%3) System.out.println("이겼네요!");
		else System.out.println("안타깝게 지셨군요!");
	}
}

