package CheckPrime;

public class PrimeNumber {
    public static void isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println(n+" is not a prime.");
                System.exit(0);
            }
        }
        System.out.println(n+" is a prime number.");
    }
}
