package question14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsSynchronized {

	public static void main(String[] args) {
		List<String> list = Collections.synchronizedList(new ArrayList<String>());

		list.addAll(Arrays.asList("Orange", "Blue", "Black"));

		synchronized (list) {
			// must be in synchronized block
			Iterator<String> it = list.iterator();

			while (it.hasNext())
				System.out.println(it.next());
		}
	}

}
