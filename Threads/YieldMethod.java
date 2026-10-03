package Threads;

public class YieldMethod {
    public static void main(String[] args) {
        // Thread.yield() --> I am willing to give my cpu time to someone else with same priority as me
        // Current thread does not go to waiting  or timed state
        // It goes to runnable state

        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 10; i++){
                System.out.println("T1 : " + i);
                Thread.yield();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 10; i++){
                System.out.println("T2 : " + i);
            }
        });
        t1.start();
        t2.start();
    }}

