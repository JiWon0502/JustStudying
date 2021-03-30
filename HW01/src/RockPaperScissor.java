import java.util.Scanner;

public class RockPaperScissor {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userWin=0, computerWin = 0, gameNum=0;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("To End this game : press (3)");
			System.out.print("Rock(1), Scissor(0), Paper(2)!");
			int user = s.nextInt();
			int computer = (int)(Math.random()*3);
			
			if(user == computer) computerWin++;
			else if(user == (computer+2)%3) userWin++;
			else if (user == 3) break;
			else if(user != computer) //잘못 입력했다고 다시 입력 받을 것!!!!!!!!
			gameNum++;
			
			System.out.println("\n\nCurrent Score : "+userWin+" vs "+computerWin);
			System.out.println("\nCurrent Game number : NO."+gameNum);
		}

		System.out.println("You Scored "+userWin +" out of "+gameNum+"!!");
		
		if(userWin > computerWin) System.out.println("\n\nYou Win!");
		else if(userWin < computerWin) System.out.println("\n\nYou Lose!!");
		else System.out.println("\n\nTie!!!");
		s.close();
	}

}
