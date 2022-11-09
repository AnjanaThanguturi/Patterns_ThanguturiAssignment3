package question19;

public class ThreadRunnable1 implements Runnable {

	public static void main(String[] args) {
		ThreadRunnable1 tr = new ThreadRunnable1();
		Thread t = new Thread(tr);
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Thread started - Runnable");

	}

}
