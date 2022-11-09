package question04;

public class PrivateAndStatic extends D {

	void method1() {
		System.out.println("World");
	}

	void method2() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		D ps = new PrivateAndStatic();
		ps.method1();
		ps.method2();

	}

}

class D {

	private void method1() {
		System.out.println("Hello");
	}

	static void method2() {
		System.out.println("World");
	}
}
