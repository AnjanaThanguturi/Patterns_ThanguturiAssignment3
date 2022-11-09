package question09;

import java.io.File;
import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new File("sample.txt"))){
			System.out.println(scan.next());
		}catch(Exception e){
			System.out.println(e);
		}
				
	}

}
