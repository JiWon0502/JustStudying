
public class Demo4 {

	public static void main(String[] args) {
		char c[] = {'4', 'h','1','8','a','x','7'};
		String s[] = {"4","-3", "1", "8", "-10","-5","7"};
		for(int i = 0; i<c.length; i++) {
			if(Character.isDigit(c[i])) {
				System.out.println(c[i]);
			}
		}
		System.out.println();
		for(int i = 0; i<s.length; i++) {
			if(Integer.parseInt(s[i])>0) {
				System.out.println(s[i]);
			}
		}
	}
}
