package test;

import java.util.Scanner;

public class leapyear 
{
	public static void main(String args[])
	{
	int a;
    System.out.println("Enter the year");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	
	if((a%4==0 && a%100!=0) ||( a%400==0))
	{
		System.out.println("This is leap year"+a);
	}
	else
	{
		System.out.println("This is not a leap year"+a);
	}
	}

}
