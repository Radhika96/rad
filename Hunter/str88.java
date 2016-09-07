import java.util.Scanner;
public class str88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String out1=sc.nextLine();char ch;String out="";
		String s=new StringBuffer(out1).reverse().toString();
		for(int i=0; i<s.length(); i++)
        {
            ch = s.charAt(i);
            if(ch!=' ')
                out = out + ch;
            s = s.replace(ch,' '); 
        }
		
		System.out.println(out);
		sc.close();
	}
}
