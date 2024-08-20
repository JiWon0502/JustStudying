
public class JaggedArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[][] = new int[4][];
		Array[0] = new int[3];
		Array[1] = new int[2];
		Array[2] = new int[3];
		Array[3] = new int[2];
		for(int i = 0; i<Array.length; i++)
			for(int j = 0; j<Array[i].length; j++)
				Array[i][j] = (i+1)*10+j;

		for(int i = 0; i<Array.length; i++) {
			for(int j = 0; j<Array[i].length; j++)
				System.out.print(Array[i][j] + " ");
			System.out.println();
		}
	}
}
