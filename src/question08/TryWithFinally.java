package question08;

public class TryWithFinally {

	public static void main(String[] args) {
		String[] a = { "Orange", "Pink", "Blue" };
		try {
			System.out.println(a[4]);
		} finally {
			System.out.println("Execption");
		}
	}

}
