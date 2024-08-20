
public class DicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("apple");
		String s2 = new String("cherry");
		
		int check = s1.compareTo(s2);
		if(check <0)
			System.out.println(s1+" - "+s2);
		else if(check == 0)
			System.out.println(s1);
		else
			System.out.println(s2+" - "+s1);
	}

}
