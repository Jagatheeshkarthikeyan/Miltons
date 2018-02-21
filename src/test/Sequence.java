package test;

import java.util.Scanner;
import java.lang.*;
public class Sequence {
	public static void main(String args[])
	{
		int a,b,c,even=0,odd=0,n;
		System.out.println("Enter the n value:");
		Scanner inp=new Scanner(System.in);
		n=inp.nextInt();
		if(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				if(i%2==0)
				{
					System.out.print(i*-1);
					a=i;
					even=even-a;
				}
				else
				{
					System.out.print("+");
					System.out.print(i);
					b=i;
					odd=odd+i;
				}
			}
			c=odd+even;
			System.out.println(" ");
			System.out.println("sum of the series is:"+c);
			
		}
		else
		System.out.println("Enter the value greater than 0");
	}
	
}
