package test;

import java.util.Scanner;
import java.lang.*;

public class Facto 
{
	public static void main(String args[])
	{
		int a,b=1;
		System.out.println("Enter the a value:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
	
		if(a>0)
		{
			for (int i=1;i<=a;i++)
			{
				b=b*i;
			}
			System.out.println("The factorial is:"+b);
		}
		else
		{
			System.out.println("Enter the value greater than 0");
		}
	}

}
