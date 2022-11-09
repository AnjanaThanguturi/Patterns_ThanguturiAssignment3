package question17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFast {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<String>();
		arrayList.addAll(Arrays.asList("Orange", "Blue", "Pink"));
		Iterator<String> iterator = arrayList.iterator();
		arrayList.add("black");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
