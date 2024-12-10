class ThreadDemo extends Thread
{
    public void run()
    {
        System.out.println("Thread is running....");
    }
}
public class ThreadExample1 {
    public static void main(String[] args) {
        ThreadDemo ob=new ThreadDemo();
        ob.start();
    }
}
