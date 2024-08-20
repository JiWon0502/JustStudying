import java.util.Scanner;
public class ReturnArray {
	static int[] iArray(int n) {
		int[] a = new int [n];
		for(int i = 0; i<n; i++) {
			a[i] = i;
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("요소(원소) 수 입력: ");
		int n = s.nextInt();
		int[] x = iArray(n);
		for(int i = 0; i<n; i++) {
			System.out.println("x["+i+"]="+x[i]);
		}
		s.close();
	}

}
