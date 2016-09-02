
import java.util.Arrays;
import java.util.Scanner;

public class dec {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		for(int i=N-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
