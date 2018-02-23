package programs;

import java.util.Scanner;

public class reversenum 
{
public static void main(String args[])
{
	int rev=0,a;
	System.out.println("Enter the n value:");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	sc.close();
	while(a>0)
	{
		rev=rev*10;
		rev=rev+a%10;
		a=a/10;
	}
	System.out.println(rev);
	}

}
