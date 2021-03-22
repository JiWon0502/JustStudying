import java.util.Scanner;
public class ComputeEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, sum, k;
		Scanner s = new Scanner(System.in);
		System.out.println("첫번쨰 숫자를 입력하세요: ");
		num1 = s.nextInt();
		System.out.println("두번쨰 숫자를 입력하세요: ");
		num2 = s.nextInt();
		System.out.println("연산을 선택하세요: ");
		System.out.println("1.덧셈(+), 2:뺄셈(-), 3:곱셈(*), 4:나눗셈(/)");
		k = s.nextInt();
		if(k==1) {
			sum = num1 + num2;
			System.out.println(num1 + "+"+num2+"="+sum);
		}
		if(k==2) {
			sum = num1 -num2;
			System.out.println(num1 + "-"+num2+"="+sum);
		}
		if(k==3) {
			sum = num1 * num2;
			System.out.println(num1 + "*"+num2+"="+sum);
		}
		if(k==4) {
			sum = num1 / num2;
			System.out.println(num1 + "/"+num2+"="+sum);
		}
		s.close();
	}

}
