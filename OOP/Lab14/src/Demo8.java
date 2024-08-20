import java.io.*;
import java.util.*;
public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(new InputStreamReader(new FileInputStream("c:\\Temp\\infile1.txt"), "UTF8"));
			while(sc.hasNext()) {
				String name = sc.next();
				String phone = sc.next();
				int score = sc.nextInt();
				System.out.println(name+":"+phone+", "+score);
			}
			sc.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
