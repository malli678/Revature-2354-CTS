class MyThread1 extends Thread {
	public void run() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
	}
}
public class MultipleThreadsExample {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();
		
		t1.start();
		t2.start();

	}

}
