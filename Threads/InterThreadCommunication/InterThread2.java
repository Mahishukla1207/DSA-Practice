package Threads.InterThreadCommunication;

public class InterThread2{
    public static void main(String[] args){
        FlagBox box = new FlagBox();
        Thread t1 = new Thread(() -> {
            for(int i = 0; i <= 20; i++){
                try{
                    Thread.sleep(100);
                    box.Producer(i);
                } catch(InterruptedException e){
                    
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0; i <= 20; i++){
                try{
                    Thread.sleep(100);
                    box.Consumer();
                } catch(InterruptedException e){
                    
                }
            }
        });
        t1.start();
        t2.start();
    }
}

class FlagBox{
    volatile Integer item;
    volatile Boolean flag = false;


    synchronized void Producer(int value) throws InterruptedException{
        while(flag == true){
            wait();
        }
        item = value;
        flag = true;
        System.out.println("Producer produces" + item);
        notify();
        // notifyAll();
    }

    synchronized void Consumer() throws InterruptedException{
        while(flag == false){
            wait();
        }
        System.out.println("Consumer consumes" + item);
        item = null;
        flag = false;
        notify();
        // notifyAll();
    }
}
