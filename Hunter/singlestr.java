import java.util.*;
class singlestr
{
public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);//baba
		String s=sc.next();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
			for(int j=i+1;j<ch.length;j++)
				if(ch[i]==ch[j])
					ch[j]='$';
		 s="";
		for(int i=0;i<ch.length;i++)
			if(Character.isAlphabetic(ch[i]))
				s+=ch[i];
		System.out.println(s);
}
}
