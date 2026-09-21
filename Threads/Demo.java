package Threads;

public class Demo {
    public static void main(String[] args){
        //Threads extending thread class
        // MyThread t1 = new MyThread();

        //Thread using runnable interface

        // MyRunnable r1 = new MyRunnable();
        // Thread t1 = new Thread(r1);

        //using lambda function-
        Thread t1 = new Thread(() -> System.out.println("Thread is running"));

        t1.start();

    }
}


// //Thread class Extend. Thread class is in Java

// class MyThread extends Thread{
//     @Override
//     //run() comes from Thread class
//     public void run(){
//         System.out.println("Thread is running");
//     }
// }



//--------THREAD USING RUNNABLE INTERFACE------------//

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running");
    }
}

