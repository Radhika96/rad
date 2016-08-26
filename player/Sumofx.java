import java.util.Scanner;

public class Sumofx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++)
			A[i]=sc.nextInt();
		int x=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(x==A[i]+A[j])
				{
					System.out.println(A[i]);
					System.out.println(A[j]);
				}
			}
		}
		sc.close();
	}

}
