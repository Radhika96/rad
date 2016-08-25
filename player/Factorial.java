import java.io.*;
import java.util.*;
public class Factorial
{
  public static void main(String[] args) 
  {
		Scanner sc=new Scanner(System.in);
		int fact=1,num,i=1;
		num=sc.nextInt();
		while(i<=num)
		{
			fact*=i;
			i++;
		}
		System.out.println(fact);
		sc.close();
	}
}
