 class ThreadDemo extends Thread
{
    private Thread t=null;
    private String threadName;
    ThreadDemo(String name)
    {
        threadName=name;
        System.out.println("Creating "+threadName);
    }
    public void run()
    {
        System.out.println("Running "+threadName);
        try {
            for(int i=4;i>0;i--)
            {
                System.out.println("Thread: "+ threadName +","+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread "+threadName+"inturrupted.");
        }System.out.println("Thread "+threadName+"exiting.");
    }
    public void start()
    {
        System.out.println("Starting "+threadName);
        if(t==null)
        {
            t=new Thread(this.threadName);
            t.start();
        }
    }
}

public class TestThread
{
    public static void main(String[] args) {
        ThreadDemo T1=new ThreadDemo("Thread-1");
        T1.start();
        T1.run();
        
        ThreadDemo T2=new ThreadDemo("Thread-2");
        T2.start();
        T2.run();
        /*Thread ob=new Thread("Thread-1");
        ob.start();

        Thread ob1=new Thread("Thread-2");
        ob1.start();*/
    }
}