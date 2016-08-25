import java.io.*;
import java.util.*;
public class HCFgiven {
	public static int HCF(int a, int b) {
	    if (b == 0) return a;
	    else return (HCF (b, a % b));
	}
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int x,y,gcd;          
		x=sc.nextInt();
		y=sc.nextInt();
		gcd=HCF(x,y);
		System.out.println(gcd);
}
