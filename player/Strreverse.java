import java.io.*;
import java.util.*;

public class Strreverse
{
  public static void main(String[] args) 
  {
  Scanner sc=new Scanner(System.in);
	String s=new StringBuffer(sc.nextLine()).reverse().toString();
  System.out.println(s);
	sc.close();
	}
}
