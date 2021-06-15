import java.io.*;
public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		String[] ss;
		try {
			FileInputStream fileInputStream = new FileInputStream("c:\\Temp\\infile1.txt");
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF8");
			BufferedReader rd = new BufferedReader(inputStreamReader);
			while((s=rd.readLine())!=null) {
				ss = s.split(" ");
				String name = ss[0];
				String phone = ss[1];
				int score = Integer.parseInt(ss[2]);
				System.out.println(name+":"+phone+", "+score);
			}
			rd.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
