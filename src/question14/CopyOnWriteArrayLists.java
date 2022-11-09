package question14;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayLists {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<String>(
				Arrays.asList("Orange", "Blue", "Pink"));

		System.out.println("Elements of CopyOnWriteArrayList :");

		// Iterating on the synchronized ArrayList using iterator.
		Iterator<String> it = threadSafeList.iterator();
		threadSafeList.add("Black");
		while (it.hasNext())
			System.out.println(it.next());
	}

}
