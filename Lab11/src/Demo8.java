
public class Demo8 {
	public static void main(String[] args) {
		int A[] = {5,1,4,9,2,8,6,3,7};
		for(int i = 0; i<A.length; i++) {
			for(int j = 0; j<A.length-i-1; j++) {
				if(A[j]>A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		for(int i = 0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
}
