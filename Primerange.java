import java.io.*;
import java.util.Scanner;
public class Primerange
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int i,flag=0; 
		for(int num=start;num<=end;num++)
		{
		  for(i=2;i<num;i++)
		  {    
		    if(num%i==0)
		    {
		      flag=0;    
		      break;    
		    }    
		    else
			   flag=1;
		  }    
		  if(flag==1)    
		  System.out.println(num);   
		}
	  sc.close();
	}
}
