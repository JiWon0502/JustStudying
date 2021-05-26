
public class Demo10 {

	public static void main(String[] args) {
		String a = "banana,apple,pineapple,grape,mango,guava,kiwi,cherry";
		String b[];
		b = a.split(",");
		
		for(int i = 0;i<b.length-1; i++) {
			for(int j = 0; j<b.length-i-1; j++) {
				if(b[j].compareTo(b[j+1]) == 1) {
					String temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
				}
			}
		}
		for(int i = 0;i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
}
