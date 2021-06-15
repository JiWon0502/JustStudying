import java.io.*;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("c:\\Temp\\out.txt");
			for(int i = 0; i<10; i++) {
				int n = 10-i;
				fout.write(n);
			}
			fout.close();
			
			FileInputStream fin = new FileInputStream("c:\\Temp\\out.txt");
			int c= 0;
			while((c=fin.read()) != -1)
				System.out.print(c+" ");
			fin.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
