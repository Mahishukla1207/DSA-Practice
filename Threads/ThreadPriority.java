package Threads;

public class ThreadPriority {
    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            System.out.println("Custom");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Custom-2");
        });

        t1.start();
        t2.start();
        t1.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
