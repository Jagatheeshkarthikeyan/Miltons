package test;
import java.lang.*;
import java.util.Scanner;

public class prime
{	
	
public static void main(String args[])
{
	boolean b=true;
	System.out.println("enter any number:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	
	
		for(int i=2;i<a;i++)
		{
			if(a%i == 0)
			{
				b=false;
								
			}
		}
		
		if(b)
		{
			System.out.println(a+":this is a prime number");
		}
		else
		{
			System.out.println(a+":this is not a prime number");
		}
	}
 }







/*

{
public void add(double a,float c)
{
	System.out.println("int"+a+","+c);

}
public void add(long b,int d)
{
	System.out.println("long"+b+","+d);
}	
public static void main(String args[])
{
prime p=new prime();
p.add(57866.9774,6376);

}
}
*/