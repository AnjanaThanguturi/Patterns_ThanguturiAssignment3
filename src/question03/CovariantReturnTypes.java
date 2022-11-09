package question03;

public class CovariantReturnTypes extends ReturnTypes {

	public Integer demo(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		CovariantReturnTypes cr = new CovariantReturnTypes();
		System.out.println(cr.demo(4, 5));
	}

}

class ReturnTypes {
	public Number demo(int a, int b) {
		Number add = a + b;
		return add;
	}
}