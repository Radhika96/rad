import java.io.*;

public class lcmgcd {
	public static int GCF(int a, int b) {
	    if (b == 0) return a;
	    else return (GCF (b, a % b));
	}
	public static void main(String[] args) {
		int x=9,y=24,gcd,lcm;            int a,b,t;
		gcd=GCF(x,y);
		lcm= x*y / GCF(x, y);
		System.out.println(gcd);
		System.out.println(lcm);

	}}
