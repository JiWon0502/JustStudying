
public class ReplaceEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "월요일부터 금요일까지는 평일이라고 하고, 토요일과 일요일은 주말이라고 한다.";
		s = s.replace("월요일", "Monday");
		s = s.replace("화요일", "Tuesday");
		s = s.replace("수요일", "Wednesday");
		s = s.replace("목요일", "Thursday");
		s = s.replace("금요일", "Friday");
		s = s.replace("토요일", "Saturday");
		s = s.replace("일요일", "Sunday");
		System.out.println(s);
	}

}
