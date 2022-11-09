package question18;

public class ThreadTwice extends Thread {

	public void run() {
		System.out.println("Thread is started");
	}

	public static void main(String[] args) {
		ThreadTwice t = new ThreadTwice();
		t.start();
		t.start();
	}

}
