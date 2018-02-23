package programs;

public class enhacedfor
{
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		for(int i:a ) //enhanced for loop
		{
			System.out.println(i);
		}
		enhacedfor en=new enhacedfor();
		System.out.println(en);
	}
}
