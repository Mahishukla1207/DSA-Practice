package Threads;

public class DaemonThread {
    public static void main(String[] args){
        // Daemon thread is low priority thread which runs in background to perform tasks such as garbage collection. It is used to provide services to user threads. When all user threads die, JVM terminates this thread automatically.
        Thread t1 = new Thread(() -> {
            while(true){
            System.out.println("Running");
            }
        });
        t1.setDaemon(true);
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        return;
        //Daemon thread stops immendiately once main thread is completed
        // Used for garbage collection
    }
}
