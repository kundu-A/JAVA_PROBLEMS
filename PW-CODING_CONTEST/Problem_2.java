//Sum of three prime triplets in equals with the input
//Ex: 2*2+3*3+5*5=38  38 is input and 2,3,5 are prime.
import java.util.*;
public class Problem_2 {
    public int prime(int n)
    {
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        int sum=0,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        sc.close();
        Problem_2 ob=new Problem_2();
        for(int i=2;i<=n/2;i++)
        {
            for(int j=i+1;j<=n/2;j++)
            {
                for(int k=j+1;k<=n/2;k++)
                {
                    if(ob.prime(i)==1 && ob.prime(j)==1 && ob.prime(k)==1){
                        if((i!=j) && (j!=k) && (k!=i)){
                            sum=i*i+j*j+k*k;
                            if(sum==n){
                                System.out.println("Yes");
                                flag=1;
                                break;
                            }
                        }
                    }
                }
                if(flag==1)
                    break;
            }
            if(flag==1)
                break;
        }
        if(flag==0)
        System.out.println("No");
    }
}
