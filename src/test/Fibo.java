package test;

import java.lang.*;
import java.util.*;

public class Fibo
{
	public static void main(String args[])
	{
	int n=9,a=0,b=1;
    for(int i=0;i<=n;++i)
    {
    	System.out.print(a+" ");
    	
    	int c=a+b;
    	a=b;
    	b=c;
    }
	}
}
