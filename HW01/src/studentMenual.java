//컴퓨터공학전공 2071032 Yoon Jiwon(윤지원)
import java.util.Scanner;
import java.util.InputMismatchException;

public class studentMenual {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stdntNum=0, maxGrade = 0, sumGrade = 0, menu, swtch = 0; 
		// number of students && max of Grade && sum of Grade && selection of the menu && to end(1) the loop
		int stdntGrade[] = null;
		//to save student`s grade average
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			if(swtch == 1) break; //처음에는 0,학생 수 입력 후에 1로 저장됨 
			printFirstLine(); //설명 출력하는 메소드 
			try { //scan for the selection of the menu
				menu = s.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("1~5 사이의 정수를 입력하세요. 다시 입력>>");
				s.nextLine();
				continue;
			}
			
			switch(menu) { 
			//학생수를 '먼저' 입력받을 수 있도록 한다. - 무조건 받고 시작하도록 설정.
			//1st menu
			case 1: 
				stdntNum = getStudentNum(s);//입력 받고, 잘못 입력받은 경우 다시 입력받도록 하는 메소드
				swtch = 1; //완전히 break하고 다음 loop로 이동하기 위한 변수 
				break;
			default: continue; // 1이 아닌 경우 전부 다시 입력받도록 설정한다.
			}
		}
		
		swtch = 0; //again at start, it must be 0
		while(true) {
			if(swtch == 1) break; //after menu == 5, swtch will be 1
			printFirstLine(); // the very first guide to print every time -> printing method
			try { //scan for the selection of the menu
				menu = s.nextInt();
			}
			catch (InputMismatchException e) { //if menu is wrong then scan again
				System.out.println("1~5 사이의 정수를 입력하세요. 다시 입력>>");
				s.nextLine(); //to clear the scan
				continue; //to re-scan
			}
			
			switch(menu) {
			//1st menu
			case 1: 
				stdntNum = getStudentNum(s); // same as before
				break;
			//2nd menu
			case 2:
				stdntGrade = new int[stdntNum]; //배열 선언
				for(int i = 0; i < stdntNum; i ++) { //배열 저장
					stdntGrade[i] = getStudentGrade(i+1, s); //각 점수를 가져오는 메소드
					sumGrade += stdntGrade[i];//to use the sum of the Grades later to calculate average
					maxGrade = maxGrade > stdntGrade[i]? maxGrade : stdntGrade[i]; //to use the maxGrade later
				}
				break;
			//3rd menu
			case 3:
				for(int i = 0; i < stdntNum; i++) { //i번째 학생의 점수 출력 후 점수만큼 그래프를 만들기 위해서 '*' 출력 
					printStudentGrade(i, stdntGrade[i]);
				}
				break;
			//4th menu
			case 4:
				for(int i = 0; i < stdntNum; i++) {
					if(stdntGrade[i] == 100) { //100인 경우 다른 경우와 다르게 숫자가 세자리여서 정렬이 안 맞아서 바꿨습니다.
						System.out.println((i+1)+"번 학생 : "+stdntGrade[i]+"점   "+getABC(stdntGrade[i])+"학점");
					}
					else if(stdntGrade[i]/10 < 1) { //한자리 수인 경우 정렬을 맞추기 위해서 바꿨습니다.
						System.out.println((i+1)+"번 학생 : "+stdntGrade[i]+"점     "+getABC(stdntGrade[i])+"학점");
					}
					else {//평범한 두자리 수인 경우
						System.out.println((i+1)+"번 학생 : "+stdntGrade[i]+"점    "+getABC(stdntGrade[i])+"학점");
					}
				}
				System.out.println("\n최고 점수: "+ maxGrade);//used the maxGrade we calculated when we scanned the whole student grade
				System.out.printf("평균 점수: %5.2f\n", (float)sumGrade/(float)stdntNum); //calculated the average and printed it
				break;
			//5th menu
			case 5:
				System.out.println("프로그램 종료합니다! 다음에 또 이용해주세요~!");
				swtch = 1;
				break;
			//other possibilities
			default: continue; //1~5사이의 정수가 아닌 다른 정수를 입력받은 경우 다시 입력받을 수 있도록 continue
			}
		}
		s.close();
	}

	
	
	//prints the first messages
	public static void printFirstLine() {
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(">> 1.학생 수 입력  >> 2.점수 입력  >> 3.점수 리스트  >> 4.점수 분석  >> 5.종료");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("선택>");
	}
	//scans the number of students
	public static int getStudentNum( Scanner s ) {
		int n;
		System.out.println("학생 수를 입력해 주세요!> ");
		try { 
			n = s.nextInt();
				return n;
		}
		catch (InputMismatchException e) {
			System.out.println("다시 입력>>");
			s.nextLine();
			return getStudentNum(s);
		}
	}
	//scans the grades of the students
	public static int getStudentGrade(int i, Scanner s) {
		System.out.println(i + "번 학생 점수를 입력해주세요 > ");
		try { 
			int n = s.nextInt();
			if(0<=n && n<=100)
				return n;
			else { // if n<0 or n>100 re-scan
				System.out.println("다시 입력>>");
				return getStudentNum(s);
			}
		}
		catch (InputMismatchException e) { //get Exception
			System.out.println("정수가 아닙니다!");
			s.nextLine();
			return getStudentGrade(i, s); //re-scan
		}
	}
	//prints the list and grade graph
	public static void printStudentGrade(int i, int grade) {
		if(grade == 100) { //세자리 수인 경우
			System.out.print((i+1)+"번 학생 : "+grade+"점   ");
			for(int j = 0; j < grade; j++) System.out.print("*");
			System.out.println("");
		}
		else if(grade < 10) { //한자리 수인 경우
			System.out.print((i+1)+"번 학생 : "+grade+"점     ");
			for(int j = 0; j < grade; j++) System.out.print("*");
			System.out.println("");
		}
		else { //두자리 수인 경우
			System.out.print((i+1)+"번 학생 : "+grade+"점    ");
			for(int j = 0; j < grade; j++) System.out.print("*");
			System.out.println("");
		}
	}
	//returns the alphabet of grade
	public static char getABC(int grade) {
		switch (grade/10){ //10의 자리 수에 따라서 알파벳 학점이 결정되므로
			case 10: //10인 경우나 9인 경우 모두 A학점
			case 9: return 'A';
			case 8: return 'B';
			case 7: return 'C';
			case 6: return 'D';
		default: return 'F';
		//return 시에는 함수가 종료되므로 별도 break문 사용하지 않았다.
		}
	}	
}
