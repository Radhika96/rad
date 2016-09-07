import java.util.Scanner;
public class panagram
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ck='a';char ch;String out ="";
		str.toLowerCase();
		for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            if(ch!=' ')
                out = out + ch;
            str = str.replace(ch,' '); 
        }
		if(out.length()>=26)
			System.out.println("Panagram");
		else
			System.out.println("Not panagram");
		sc.close();
	}
}
