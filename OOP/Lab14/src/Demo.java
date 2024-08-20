import java.io.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStreamReader rd = new InputStreamReader(System.in);
			int c = rd.read();
			System.out.println((char)c);
			rd.close();
		}
		catch(IOException e) {
			System.out.println("못 읽음");
		}
	}

}
