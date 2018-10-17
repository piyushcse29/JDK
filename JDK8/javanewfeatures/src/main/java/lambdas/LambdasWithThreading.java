package lambdas;

public class LambdasWithThreading {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Piyush");
        Thread thread = new Thread(r);
        thread.start();
    }
}
