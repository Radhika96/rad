import java.util.Scanner;
public class strirev 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		String st[]=s.split(" ");
		for(int i=st.length-1;i>=0;i--)
			System.out.print(st[i]+" ");
		sc.close();
	}

}
