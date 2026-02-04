class MyThread extends Thread {
	public void run() {
		System.out.println("Thread is running!");
	}
}
public class BasicThread {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
//		run() → code that runs in a new thread
//
//		start() → starts the thread (NEVER call run() directly)

	}

}
