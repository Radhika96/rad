import java.io.*;
import java.util.Scanner;
public class Evenornot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	  sc.close();
	}

}
