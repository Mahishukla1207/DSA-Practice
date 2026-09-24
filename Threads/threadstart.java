package Threads;
public class threadstart {
    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            System.out.println("Current Thread is:" + Thread.currentThread().getName());
        });
        // t1.start(); //we'll get o/p as thread-0
        t1.run(); //when we do t1.run() we get o/p as main because t1 thread has not started yet, you're aclling main thread only
    }
}
