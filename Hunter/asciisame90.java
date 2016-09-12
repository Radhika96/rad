import java.util.Scanner;
public class asciisame90 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=sc.nextLine();
		int len1=0;int len2=0;
		if(str.length()==str2.length())
		{
		for(int i=0;i<str.length();i++)
		{
			len1+=(int)str.charAt(i);
			len2+=str2.charAt(i);
		}
		if(len1==len2)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		}
		
		sc.close();
	}

}
