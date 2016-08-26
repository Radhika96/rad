import java.util.Scanner;
public class Contain
{
public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	  String str=sc.nextLine();
	  System.out.println(str.contains("hai"));
	  System.out.println(str.contains("no"));
    sc.close();	
  }
}
