package arraylists;

import java.util.ArrayList;
import java.util.Iterator;

public class iterat {
	public static void main(String args[]) {
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(500);
		System.out.println(ar);
		System.out.println(ar.isEmpty());
		System.out.println(ar.contains(300));
		Iterator<Integer> it=ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
