package question25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaFeatures {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.addAll(Arrays.asList("Orange", "Blue", "Pink"));
		arrayList.forEach((array) -> {
			System.out.print(array + " ");
		});
		System.out.println("");
		System.out.println("******");
		List<Integer> arrayListFilter = new ArrayList<>();
		arrayListFilter.addAll(Arrays.asList(1, 2, 3));
		Stream<Integer> arrayStream = arrayListFilter.stream();
		Stream<Integer> filtered = arrayStream.filter(num -> num > 2);
		List<Integer> list = filtered.collect(Collectors.toList());
		System.out.println(list);
	}

}
