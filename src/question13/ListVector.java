package question13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListVector {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		arrayList.addAll(Arrays.asList("Orange", "Blue", "Pink"));
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("*******");

		Vector<String> vectorList = new Vector<>();
		vectorList.addAll(Arrays.asList("Lion", "Tiger"));
		Enumeration enumeration = vectorList.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

}
