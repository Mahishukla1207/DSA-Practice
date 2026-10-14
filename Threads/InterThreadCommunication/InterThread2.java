package Threads.InterThreadCommunication;

public class InterThread2{
    public static void main(String[] args){
        FlagBox box = new FlagBox();
        Thread t1 = new Thread(() -> {
            for(int i = 0; i <= 20; i++){
                try{
                    box.Producer(i);
                } catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0; i <= 20; i++){
                try{
                    box.Consumer();
                } catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });
        t1.start();
        t2.start();
    }
}

class FlagBox{
    private Integer item;

    synchronized void Producer(int value) throws InterruptedException{
        while(item != null){
            wait();
        }
        item = value;
        System.out.println("Producer produces" + item);
        notifyAll();
    }

    synchronized void Consumer() throws InterruptedException{
        while(item == null){
            wait();
        }
        System.out.println("Consumer consumes" + item);
        item = null;
        notifyAll();
    }
}
