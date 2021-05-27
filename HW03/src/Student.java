//2071032_ComputerScience_and_Engineering_Jiwon_Yoon_윤지원

public interface Student {
	void showStudentInfo(); //print student info
	void addSemester(int i, double s[]); //record ith subject grades
	void showScore(); //print all subject grades && average for 1 semester
	void showTotAvg(); //print average of all semesters till now
	int getSemester(); //return what semester the student is on
}
