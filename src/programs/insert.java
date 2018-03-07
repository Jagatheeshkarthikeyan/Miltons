package programs;

public class insert {
	public static void main(String args[]) {
		StringBuffer str1 = new StringBuffer("java");
		str1.append(" program");
		System.out.println(str1);
		str1.insert(0, "Examples of ");
		System.out.println(str1);
		str1.delete(0, 8);
		System.out.println(str1);
		str1.replace(1, 1, "oops ");
		System.out.println(str1);
		str1.reverse();
		System.out.println(str1);
		
		
	}

}
