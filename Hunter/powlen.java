import java.util.Scanner;
public class powlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();int sum=0;
		int len=String.valueOf(num).length();
		int[] res=new int[len];
	  for(int i = 0; i < len; i++) 
      {
       int j = Character.digit(String.valueOf(num).charAt(i), 10);         
       res[i]=j; 
      }
    for(int i=0;i<len;i++)
      	sum+=(int)Math.pow(res[i], len);
    System.out.println(sum);
    sc.close();
	}

}
