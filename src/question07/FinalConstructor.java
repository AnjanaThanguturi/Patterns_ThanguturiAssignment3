package question07;

public class FinalConstructor extends FinalConstructorDemo {

	public static void main(String[] args) {

	}

}

class FinalConstructorDemo {
	private int num;

	public final FinalConstructorDemo() {
		num = 5;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
