package inheritance;

public class child extends parent
{
child()
{
	System.out.println("child constructor");
}
public void add() 
{
	System.out.println("child add method");
	super.sub();
}
public void sub()
{
	System.out.println("child sub method");
}
public static void main(String args[])
{
	child ch=new child();
	ch.add();
	ch.sub();
}
}
