package threadPrac;

public class DeadLockPrac {
    static int Val;
    public static void increase() {
        Val = Val+1;
    }
    public static void main(String[] args) throws InterruptedException {
        Runnable ch1 = () ->
        {
            for(int i=0; i<=20; i++)
            {
                increase();
            }
        };
        Runnable ch2 = () ->
        {
            for(int i=0; i<=20; i++)
            {
                increase();
            }
        };
        Thread t1 = new Thread(ch1);
        Thread t2 = new Thread(ch2);
        t1.start();
        t2.start();
        
        // t1.join();
        // t2.join();

    }
}
