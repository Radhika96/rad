package com.bacis;
import java.io.*;
import java.util.*;

public class Intreverse
{
  public static void main(String[] args) 
  {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int t=num;int rev=0;
		while(num!=0)
		{
			int r=num%10;num=num/10;
			rev=rev*10+r;
		}
		System.out.println(rev);
		sc.close();
	}
}
