package question06;

public class StringAndStringBuffer {

	public static void main(String[] args) {

		// String object
		String s1 = "Northwest";
		String s2 = s1 + " Missouri";
		System.out.println(s2);
		
		// String Buffer
		StringBuffer s3 = new StringBuffer("Northwest");
		s3.append(" Missouri");
		System.out.println(s3);
		
	}

}
