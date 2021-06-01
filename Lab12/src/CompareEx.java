import java.util.*;
public class CompareEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
		String s1 = sc.next();
		String s2 = sc.next();
		
		StringTokenizer st1 = new StringTokenizer(s1);
		StringTokenizer st2 = new StringTokenizer(s2);
		
		while(st1.hasMoreTokens() && st2.hasMoreTokens()) {
			if((st1.nextToken()).compareTo(st2.nextToken())==0)
				System.out.println("같다");
			else System.out.println("다르다");
		}
		if(st1.hasMoreTokens())
			System.out.println("s1이 길다");
		else if(st2.hasMoreTokens())
			System.out.println("s2가 길다");
		sc.close();
	}

}
