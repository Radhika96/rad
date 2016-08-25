import java.io.*;
import java.util.*;
public class Lcm 
{
  public static int LCM(int a, int b)
  {
	    if (b == 0) 
	      return a;
	    else 
	      return (LCM (b, a % b));
	}
	public static void main(String[] args) 
	{
		int x,y,lcm;  
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		lcm= x*y / LCM(x, y);
    System.out.println(lcm);
	  sc.close();
	}
}
