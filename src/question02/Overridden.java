package question02;

class C {
	protected void method() {
		System.out.println("Hello");
	}
}

public class Overridden extends C {
	public void method() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		Overridden b = new Overridden();
		b.method();
	}
}
