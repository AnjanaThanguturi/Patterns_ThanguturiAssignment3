package question01;

import java.util.Arrays;

public class GenericDemo {

	public static void main(String[] args) {
		GenericList<String> genericList = new GenericList<>();
		genericList.setArrays(Arrays.asList("Monday", "Tuesday", "Wednesday"));
		
		GenericList<Integer> genericIntegerList = new GenericList<>();
		genericIntegerList.setArrays(Arrays.asList(1,2,3));
		
		System.out.println(genericList.toString());
		System.out.println(genericIntegerList.toString());
	}

}
