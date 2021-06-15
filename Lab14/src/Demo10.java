import java.io.FileWriter;
import java.io.IOException;
public class Demo10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double d;
		try {
			FileWriter f = new FileWriter("c:/Temp/data/txt");
			for(int i = 0; i<50;i++) {
				d = Math.random()*100;
				n = (int)(Math.round(d));
				f.write(n+"\r\n");
			}
			f.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
