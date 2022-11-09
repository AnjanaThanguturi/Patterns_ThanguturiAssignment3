package question12;

public class FinalizeDemo {

	public static void main(String[] args) {
		final int a = 7;
		try {
			int b = a / 0;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block");
		}
		FinalizeDemo finalizeDemo = new FinalizeDemo();
		finalizeDemo = null;
		System.gc();
		System.out.println("Garbage collected");
	}

	protected void finalize() {
		System.out.println("Inside finalize() method");
	}
}
