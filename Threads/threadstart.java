package Threads;
public class threadstart {
    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            System.out.println("Current Thread is:" + Thread.currentThread().getName());
        });
        // t1.start(); //we'll get o/p as thread-0
        t1.run();
    }
}
