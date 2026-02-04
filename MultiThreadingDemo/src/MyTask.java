/* BETTER Way (Recommended): implements Runnable

Why better?

Java supports only one class inheritance

Runnable allows flexibility

Example 2: Using Runnable
*/
public class MyTask implements Runnable {

	public void run() {
        System.out.println("Running in thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyTask task1 = new MyTask();
        MyTask task2 = new MyTask();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }

}
