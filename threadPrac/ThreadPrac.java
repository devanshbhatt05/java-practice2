package threadPrac;

class ChildThreadOne implements Runnable
{
    public void run()
    {
        for(int i=0; i<5;i++)
        {
            System.out.println("Child thread one show");
        }
    }
}

// 



public class ThreadPrac {
public static void main(String[] args) 
{

    Runnable ch2 = () ->{
        for(int i=0; i<5;i++)
        {
            System.out.println("Child thread two show");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    };

    ChildThreadOne ch1 = new ChildThreadOne();
        // ch1.run();
        // ch2.run();
    Thread t1 = new Thread(ch1);
    Thread t2 = new Thread(ch2);
   
    t1.start();  
    t2.start();     


}
        

        

    
}
