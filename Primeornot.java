import java.io.*;
import java.util.Scanner;
public class Primeornot
{
		public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i,flag=0;
		for(i=2;i<=num/2;i++)
		{
		  if(num%i==0)
		  {    
		    System.out.println("Number is not prime");    
		    flag=1;    
		    break;    
		  }    
		}    
		  if(flag==0)    
		    System.out.println("Number is prime");   
		sc.close();
	}}
