import java.util.Scanner;
public class Powerr
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();int sum=0;
		int len=String.valueOf(num).length();
		int[] res=new int[len];
    for(int i = 0; i < len; i++) 
      {
       int j = Character.digit(String.valueOf(num).charAt(i), 10);
       res[i]=j; 
      }
    for(int i=0;i<len-1;i++)
    	sum+=(int)Math.pow(res[i], res[i+1]);
    	System.out.println(sum+1);
		  sc.close();
	}
}
