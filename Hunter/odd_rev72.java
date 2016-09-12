package hunter;

import java.util.Scanner;

public class odd_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//This is an example for this question
		String str=sc.nextLine();
		String[] st1=str.split(" ");
		for(int i=0;i<st1.length;i++)
		{
			if(i%2==0)
			{
				String s1=new StringBuffer(st1[i]).reverse().toString();
				System.out.print(s1+" ");	
			}
			else
				System.out.print(st1[i]+" ");
		}
		sc.close();
	}

}
