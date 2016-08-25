import java.io.*;
import java.util.Scanner;
public class Countdigits 
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  int val=sc.nextInt();
		int t=val;
		int count=0;
		while(t>0)
		{
			t=t/10;
			count++;
		}
		System.out.println("The number of digits in "+val+" is "+count);
	  sc.close();
  }
}
