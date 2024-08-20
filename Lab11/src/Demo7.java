
public class Demo7 {
	public static void main(String[] args) {
		String a = new String("  Hello, ");
		String b = new String("World!  ");
		
		a = a.concat(b);
		System.out.println("문자열 연결");
		System.out.println(a);
		System.out.println();
		
		a = a.trim();
		System.out.println("문자열 양 옆의 공백 제거");
		System.out.println(a);
		System.out.println();

		a = a.replace("o", "###");
		System.out.println("문자열에서 o를 ###으로 바꿈");
		System.out.println(a);
		System.out.println();
		
		String s[] = a.split(",");
		System.out.println("문자열을 콤마로 분리");
		for(int i = 0; i < s.length; i++)
			System.out.println("분리된 "+ i +"번 문자열: "+ s[i]);
		System.out.println();
		
		a = a.substring(3);
		System.out.println("문자열의 일부 a[3] ~ 끝");
		System.out.println(a);
		System.out.println();
		
		char c = a.charAt(2);
		System.out.println("문자열 속의 문자 a[2]");
		System.out.println(c);
		System.out.println();
		
		a = a.toLowerCase();
		System.out.println("소문자로 변환");
		System.out.println(a);
		System.out.println();
		
		a = a.toUpperCase();
		System.out.println("대문자로 변환");
		System.out.println(a);
		System.out.println();
	}
}
