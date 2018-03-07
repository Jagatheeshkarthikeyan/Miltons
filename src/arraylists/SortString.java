package arraylists;

public class SortString {
	static String name="This is my first pgm";
	static String ar[]=name.split(" ");
	public static void main(String args[]) {
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j].compareTo(ar[i])<0) {
					String temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				System.out.println(ar[j]);
			}
		}
	}

}
