import java.io.*;
import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		boolean leap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		if(year<0)
			System.out.println(year+" does not exist");
		else if(leap)
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");
		sc.close();
	}
