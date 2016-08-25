
import java.io.*;
import java.util.Scanner;
public class Naturalsum
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
	int sum=(n+n*n)/2;
	System.out.println(sum);
	sc.close();
	}
}
