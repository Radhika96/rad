import java.io.*;
import java.util.Scanner;

public class Posneg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>0)
			System.out.println("The number is positive ");
		else if(a<0)
			System.out.println("The number is negative");
		else 
			System.out.println("The number is zero");
		
		sc.close();
	}

}
