class ThreadDemo extends Thread
{
    public void run()
    {
        System.out.println("Thread is running....");
    }
}
public class ThreadExample2 {
    public static void main(String[] args) {
        Thread ob=new Thread();
        ob.start(); 
    }
}
