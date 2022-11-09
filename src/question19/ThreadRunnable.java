package question19;

public class ThreadRunnable extends Thread {

	public void run() {
		System.out.println("Thread is started");
	}

	public static void main(String[] args) {

		ThreadRunnable tr = new ThreadRunnable();
		tr.start();
	}

}
