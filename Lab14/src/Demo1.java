import java.io.*;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("c\\Temp\\infile.txt");
			int c;
			while((c=fin.read())!=-1) {
				System.out.println((char)c);
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("입력 오류");
		}
	}

}
