import java.io.*;
import java.util.Scanner;
public class Palindrome
{
		public static void main(String[] args) 
		{
		  Scanner sc=new Scanner(System.in);
		  int num=sc.nextInt();
		  int t=num;
		  int rev=0;
		  while(num!=0)
		  {
		    int r=num%10;
		    num=num/10;
			  rev=rev*10+r;
		  }
		  if(num==rev)
		    System.out.println("The number is Palindrome");
		  else
			  System.out.println("The number is not a Palindrome");
		  sc.close();
	  }
}
