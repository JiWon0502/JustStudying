
public class CalcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result1 = 10*10*Calc.pi;
		int result2 = Calc.plus(20, 5);
		int result3 = Calc.minus(30, 20);
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}

}
