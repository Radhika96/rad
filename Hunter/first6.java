import java.util.Scanner;
public class first6
{
  public static void main(String[] args) 
  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int count=0;
		int A[]=new int[n];
		for(int i=0;i<n;i++)
			A[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(A[i]==A[j])
				{
					System.out.println(A[i]);
					count++;//System.out.println(count+"II");
					break;
				}
			}
			if(count==1)
				break;
		}
		sc.close();
	}
}
