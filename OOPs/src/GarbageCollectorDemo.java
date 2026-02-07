
public class GarbageCollectorDemo {
	public void finalize() {
		System.out.println("Garbage Collection performed by JVM");
	}
	public static void main(String[] args) {
		GarbageCollectorDemo t1 = new GarbageCollectorDemo();
		GarbageCollectorDemo t2 = new GarbageCollectorDemo();
		System.out.println(t1);
		System.out.println(t2);
		
		t1 = null;
		t2 = null;
		System.out.println(t1);
		System.out.println(t2);
		System.gc();

	}

}
