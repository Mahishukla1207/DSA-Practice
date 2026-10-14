package Threads.InterThreadCommunication;

public class Interthread{
    public static void main(String[] args){
        Box box = new Box();
        Thread t1 = new Thread(() -> {
            for(int i = 0; i <= 20; i++){
                try{
                    Thread.sleep(100);
                } catch(Exception e){
                }
                box.Producer(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0; i <= 20; i++){
                try{
                    Thread.sleep(70);
                } catch(Exception e){
                }
                box.Consumer();
            }
        });
        t1.start();
        t2.start();
    }
}
class Box{
    Integer item;
    Boolean flag = false;

    void Producer(int value){
        item = value;
        flag = true;
        System.out.println("Producer produces" + item);
    }
    void Consumer(){
        System.out.println("Consumer consumes" + item);
        item = null;
        flag = false;
    }
}