import java.io.*;
import java.util.*;
public class Countcda
{
	static int digit,letters,alpha;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();int len=str.length();
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
				digit++;
			else if(Character.isLetter(ch))
				letters++;
			else
				alpha++;
		}
		System.out.println(digit);
		System.out.println(letters);
		System.out.println(alpha);
	sc.close();
	}
}
