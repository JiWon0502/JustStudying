
public class Calc {
	static double pi = 3.14159;
	
	public static int plus(int a, int b) {
		return a+b;
	}
	public static int minus(int a, int b) {
		return a-b;
	}
	public static int abs(int a) {
		return a>0?a :-a;
	}
	public static int max(int a, int b) {
		return (a>b)? a: b;
	}
	public static int min(int a, int b) {
		return (a>b)?b: a;
	}
}
