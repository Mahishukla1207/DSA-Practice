
public class StampedLock {
    public static void main(String[] args){
        SharedResource sr = new SharedResource();
        Thread r1 = new Thread(() -> {sr.read();});
        Thread r2 = new Thread(() -> {sr.read();});
        Thread r3 = new Thread(() -> {sr.read();});

        Thread w1 = new Thread(() -> {sr.write(5);});
        Thread w2 = new Thread(() -> {sr.write(2);});
        Thread w3 = new Thread(() -> {sr.write(9);});

        r1.start();
        r2.start();
        r3.start();

        w1.start();
        w2.start();
        w3.start();
    }
}

class SharedResource{
    private int value = 0;

    java.util.concurrent.locks.StampedLock lock = new java.util.concurrent.locks.StampedLock();
    

    public int read(){
        
        long stamp = lock.tryOptimisticRead();
        
        int currentValue = value;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        if(lock.validate(stamp) == false){
            //fall-over logic
            //try pessimistic read
            stamp = lock.readLock();
            try {
                currentValue = value;
            }
            finally{
                lock.unlockRead(stamp);
            }
        }
        System.out.println(Thread.currentThread().getName() + " reads value as " + currentValue);
        return currentValue;
    }
    public void write(int newValue){
        long stamp = lock.writeLock();
        try {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            value = newValue;
            System.out.println(Thread.currentThread().getName() + " changed value to " + value);
        }
        finally{
            lock.unlockWrite(stamp);
        }
    }
}