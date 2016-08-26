import java.util.Scanner;
public class Swap
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char c;
		char ch[]=str.toCharArray();
		int len=str.length();
		if(len%2==0)
		{
			for(int i=0;i<len;i=i+2)
			{
				c=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=c;
			}
		for(int i=0;i<len;i++)
			System.out.print(ch[i]);
		}
		else
			System.out.println("Can't swap");
		sc.close();
	}
}
