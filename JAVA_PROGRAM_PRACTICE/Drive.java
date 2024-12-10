class Explthrd extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("The child Thread.");
        }
    }
}
public class Drive {
    public static void main(String[] args) {
        Explthrd ob=new Explthrd();
        ob.setPriority(10);
        ob.start();
        for(int k=0;k<5;k++)
            System.out.println("The main thread");
    }
}
