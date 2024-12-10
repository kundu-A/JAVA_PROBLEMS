package CheckPrime;

public class PrimeInArray {
    public void primeInArray(int ar[])
    {
        int c=0;
        for(int i=0;i<ar.length;i++)
        {
            int flag=0;
            for(int j=2;j<=ar[i]/2;j++)
            {
                if(ar[i]%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(ar[i]+" ");
                c++;
            }
        }
        System.out.println();
        System.out.print("Total number of prime in this array is "+c);
        System.out.println();
    }
}
