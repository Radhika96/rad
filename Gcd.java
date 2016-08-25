import java.io.*;
public class Gcd {
	public static int GCD(int a, int b) {
	    if (b == 0) return a;
	    else return (GCD (b, a % b));
	}
	public static void main(String[] args) {
		int x=9,y=24,gcd;          
		gcd=GCD(x,y);
		System.out.println(gcd);
}
