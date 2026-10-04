package Threads;

public class IsAliveMethod {
    public static void main(String[] args){
        //isAlive() --> start se end tak alive hoti hai
        Thread t1 = new Thread(() -> {
            try{
            Thread.sleep(2000);}
            catch(Exception e){}
        });
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        try{
            Thread.sleep(3000);
        }
        catch(Exception e){}
        System.out.println(t1.isAlive());
    }
}
