package PAP;
public class PerfectNumber {
    public void perfect(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
                sum=sum+i;
        }
        if(sum==n)
            System.out.println("True");
        else 
            System.out.println("False");
    }
}