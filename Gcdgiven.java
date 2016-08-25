import java.io.*;
import java.util.*;
public class Gcdgiven {
	public static int GCD(int a, int b) {
	    if (b == 0) return a;
	    else return (GCD (b, a % b));
	}
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int x,y,gcd;          
		x=sc.nextInt();
		y=sc.nextInt();
		gcd=GCD(x,y);
		System.out.println(gcd);
}
