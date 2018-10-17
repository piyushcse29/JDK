package lambdas;

public class LambdasWithThreading {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Piyush");
        Thread thread = new Thread(r);
        thread.start();

        Thread thread1 = new Thread(() -> System.out.println("Piyush1"));
        thread1.start();
    }
}
