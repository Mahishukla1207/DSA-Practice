package Threads;

public class ThreadIdAndName {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(() -> System.out.println("Name of my thread is : " + Thread.currentThread().getName()));
        t1.start();
        Thread t2 = new Thread(() -> System.out.println("Name of my 2nd thread is : " + Thread.currentThread().getName()));
        t2.start();
    }
}


//Thread ID and Name