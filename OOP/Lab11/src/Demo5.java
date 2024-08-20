
public class Demo5 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		Integer A[] = {6,7,8};
		int sum = 0;
		for(int i = 0; i<a.length; i++)
			sum+=a[i];
		for(int i = 0; i<A.length; i++)
			sum+= A[i];
		System.out.println(sum);
	}
}
