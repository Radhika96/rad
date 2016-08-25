import java.io.*;
import java.util.*;
public class Countchar
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		int letters=0;
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(Character.isLetter(ch))
				letters++;
		}
		System.out.println(letters);
		sc.close();
	}
}
