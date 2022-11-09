package question10;

import java.io.IOException;

public class ThrowsClause extends ThrowClause {

	public int divide() throws IOException {
		int c = 2 / 0;
		return c;
	}

	public static void main(String[] args) {
		ThrowClause t = new ThrowsClause();
		t.divide();
	}

}

class ThrowClause {

	private int a;

	public int divide() {
		int c = a / 0;
		return c;
	}

}
