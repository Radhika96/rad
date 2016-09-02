package hunter;

import java.util.Scanner;

public class palinlen{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		String s1=new StringBuffer(s).reverse().toString();
		if(!s.equals(s1))
			System.out.println(s.length());
		else
			System.out.println("It is a palindrome");
		sc.close();
	}

}
