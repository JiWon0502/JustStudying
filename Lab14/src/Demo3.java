import java.io.*;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("c:\\Temp\\outfile1.txt"));
			int a = 10;
			double d = 20.0;
			boolean b = true;
			char c = 'a';
			dos.writeInt(a);
			dos.writeDouble(d);
			dos.writeBoolean(b);
			dos.writeChar(c);
			dos.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("c:\\Temp\\outfile1.txt"));
			int aa = dis.readInt();
			double dd = dis.readDouble();
			boolean bb = dis.readBoolean();
			char cc = dis.readChar();
			dis.close();
			
			System.out.println("aa = "+aa);
			System.out.println("dd = "+dd);
			System.out.println("bb = "+bb);
			System.out.println("cc = "+cc);

		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
