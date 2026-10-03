package Threads;

public class InterruptMethodInThread {
    public static void main(String[] args) throws InterruptedException{
        /* t1.interrupt() --> sends a signal that t1 should stop doing whatever it is doing */

        Thread t1 =  new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) { 
                System.out.println("Running");
            }});
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }
}
