import java.io.IOException;
import java.util.Scanner;
public class ComputeEx04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num1, num2, sum;
		char k;
		Scanner s = new Scanner(System.in);
		System.out.println("첫번쨰 숫자를 입력하세요: ");
		num1 = s.nextInt();
		System.out.println("두번쨰 숫자를 입력하세요: ");
		num2 = s.nextInt();
		System.out.println("연산을 선택하세요: ");
		System.out.println("+(덧셈), -(뺄셈), *(곱셈), /(나눗셈), %(나머지)");
		k = (char)System.in.read();
		if(k=='+') {
			sum = num1 + num2;
			System.out.println(num1 + "+"+num2+"="+sum);
		}
		if(k=='-') {
			sum = num1 -num2;
			System.out.println(num1 + "-"+num2+"="+sum);
		}
		if(k=='*') {
			sum = num1 * num2;
			System.out.println(num1 + "*"+num2+"="+sum);
		}
		if(k=='/') {
			sum = num1 / num2;
			System.out.println(num1 + "/"+num2+"="+sum);
		}
		if(k=='%') {
			sum = num1 % num2;
			System.out.println(num1 + "%"+num2+"="+sum);
		}
		s.close();
	}

}
