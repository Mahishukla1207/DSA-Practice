package Threads;

public class ThreadLifeCycle{
    public static void main(String[] args){
        // Thread new stage

        Thread mainThread = Thread.currentThread();

        Thread t1 = new Thread(() -> {
            System.out.println("Name of new thread is:" + Thread.currentThread().getName());
            System.out.println("Main thread state is:" + mainThread.getState()); //will print TIMED_WAITING
        });
        // t1.start();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        try {
        Thread.sleep(2000); 
        }
        catch (Exception e) {}
        System.out.println(t1.getState()); //will print terminated
}
}