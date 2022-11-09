package question15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hash {

	public static void main(String[] args) {

		Map<String, String> map1 = new HashMap<String, String>();
		map1.put(null, null);
		map1.put(null, "2");
		System.out.println(map1);

		Hashtable<String, String> map2 = new Hashtable<String, String>();
		map2.put(null, null);
		System.out.println(map2);
	}

}
