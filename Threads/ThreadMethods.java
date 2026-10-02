package Threads;
public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException{
        //Thread.sleep()
        //Main Thread start -> TIMED WAITING -> RUNNING -> ends


        // System.out.println("Main Thread starts");
        // try {
        //     Thread.sleep(2000);
        // } catch (Exception e) {
        // }
        // System.out.println("Main THreads ends");



        /*Thread.join() 

        Main THread --> WAITING
        t1 thread --> RUNNABLE --> TERMINATED
        Main thread --> RUNNABLE

        */

        System.out.println("Main thread starts");
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            System.out.println("Thread 0 starts");
        });

        t1.start();
        // t1.join(); //let the thread t1 complete its execution first before completing any other task
        t1.join(1000); //this is join ka overloaded method and also iska matlab ye hai ki wait for t1 to execute just for 1 sec if it executes good if not continue aage ka work
        System.out.println("MAIN THREAD ENDS");
    }
}
