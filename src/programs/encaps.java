package programs;

public class encaps 
{
 int ivalue;
 char cvalue;
 private void display(int a)
 {
	 System.out.println(a);
	 
 }
 
 public static void main(String args[])
 {
	 encaps en= new encaps();
	 en.display(10);
 }

}
