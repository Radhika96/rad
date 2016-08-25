import java.io.*;
import java.util.Scanner;
public class Power
{
		public static void main(String[] args) 
		{
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int p=sc.nextInt();
		  System.out.println(Math.pow(n,p));
		  sc.close();
	  }
}
