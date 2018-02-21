package test;

public class Amsg 
{
	public static void main(String args[])
	{
		int n=153,a,temp=0;
		int b=n;
		while(n!=0)
		{
			a=n%10;
			temp=(a*a*a)+temp;
			n=n/10;
		}
		if (b==temp)
		{
			System.out.println("this is a amstrong number");
		}
		else
		{
			System.out.println("this is not an amstrong number");
		}
	}
	
	
}
