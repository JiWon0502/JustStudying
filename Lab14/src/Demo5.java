import java.io.*;
public class Demo5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			FileWriter fout = new FileWriter("C:/Temp/outfile2.txt");
			while((c=in.read())!=-1)
				fout.write(c);
			in.close();
			fout.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

}
