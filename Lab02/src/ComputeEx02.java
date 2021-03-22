import java.util.Scanner;
public class ComputeEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		int result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요: ");
		num1 = s.nextInt();

		System.out.println("두번째 숫자를 입력하세요: ");
		num2 = s.nextInt();
		
		result = num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);

		result = num1 - num2;
		System.out.println(num1+"-"+num2+"="+result);
		
		result = num1*num2;
		System.out.println(num1+"*"+num2+"="+result);

		result = num1/num2;
		System.out.println(num1+"/"+num2+"="+result);
		
	}

}
