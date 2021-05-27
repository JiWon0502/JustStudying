//2071032_ComputerScience_and_Engineering_Jiwon_Yoon_윤지원

public class UnderGradStudent implements Student {
	String name;
	int currentSemester = 0;
	double totAverage = 0; //total average till current semester
	double avgArray[] = new double[6];
	//avgArray[i] = (i+1)th semester grade average
	double gradeArray[][] = new double[8][6];
	//gradeArray[semester-1][0~5] = 0~5 subject grade
	
	//constructor
	public UnderGradStudent(String name) {
		this.name = name;
	}
	
	@Override
	public void showStudentInfo() {
		// TODO Auto-generated method stub
		System.out.println("학부 "+ currentSemester+"학기 "+name);
	}

	@Override
	public void addSemester(int i, double[] s) {
		double sum=0;
		// TODO Auto-generated method stub
		currentSemester++;//현재 학기수 +1
		//save ith semester grades to gradeArray
		for(int sub = 0; sub<6; sub++) {
			gradeArray[i-1][sub] = s[sub];
			//ith semester grade are saved in gradeArray[i-1]
			sum+=s[sub]; //get the sum of this current semester
		}
		//calculate the average of grades ith semester and save it in aveArray[i-1]
		avgArray[i-1] = sum/6;
		//calculate total average of all grades
		totAverage = (totAverage*(currentSemester-1)+sum/6)/currentSemester;
	}

	@Override
	public void showScore() {
		// TODO Auto-generated method stub
		for(int i = 0;i <currentSemester; i++) { //학기
			System.out.print((i+1)+"학기: "); //i=0~7일때 1~8번째 학기 출력을 위해서 (i+1)
			for(int j = 0; j<6; j++) { //과목 수
				System.out.print(gradeArray[i][j]+" ");
			}
			System.out.printf("학기 평균 = %.2f", avgArray[i]); //소수점 아래 2자리 수까지만 출력하기 위해서 printf
			System.out.println();
		}
	}

	@Override
	public void showTotAvg() {
		// TODO Auto-generated method stub
		System.out.printf("총평균 = %.2f", totAverage); //소수점 아래 2자리 수까지만 출력하기 위해서 printf
	}

	@Override
	public int getSemester() {
		// TODO Auto-generated method stub
		return currentSemester;
	}

}
