import java.util.Scanner;
public class Sumoftar
{
  public static void main(String[] args) 
  {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int r,sum,i=0;
		int n=sc.nextInt();int arr[]=new int[n];
		while(i<n)
		{
			arr[i]=sc.nextInt();
			i++;
		}
		int target=sc.nextInt();
		for(int j=0;j<arr.length-1;j++)
		{
			sum=arr[j]+arr[j+1];
			if(sum==target)
			{
				System.out.print(arr[j]+" "+arr[j+1]);
			}
		}
		sc.close();
	}

}
