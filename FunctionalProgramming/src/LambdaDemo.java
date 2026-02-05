public class LambdaDemo {

    public static void main(String[] args) {

        // 1. Without lambda (Anonymous class)
        Runnable task1 = new Runnable() {
            public void run() {
                System.out.println("Hello from Task - without lambda");
            }
        };

        // 2. Using lambda expression (Lambda → short code)
        Runnable task2 = () -> System.out.println("Hello from Task - using lambda");

        // 3. Method reference with static method (Method reference → even shorter, cleaner code)
        Runnable task3 = LambdaDemo::sayHello;

        // 4. Method reference with non-static method
        LambdaDemo demo = new LambdaDemo();
        Runnable task4 = demo::sayHelloNonStatic;

        new Thread(task1).start();
        new Thread(task2).start();
        new Thread(task3).start();
        new Thread(task4).start();
    }

    static void sayHello() {
        System.out.println("Hello from static method");
    }

    void sayHelloNonStatic() {
        System.out.println("Hello from non-static method");
    }
}
