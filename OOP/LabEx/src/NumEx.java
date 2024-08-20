
public class NumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringNumber = {"23", "12", "998", "3.141592"};
		int i = 0;
		try {
			for(i = 0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("정수로 변환된 값은 "+  j);
			}
		}
		catch(NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다!");
		}
	}

}
