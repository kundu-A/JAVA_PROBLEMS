import java.util.*;
public class LeftOddAndRightEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range=sc.nextInt();
        int ar[]=new int[range];
        System.out.println("Enter values in array: ");
        for(int i=0;i<range;i++)
            ar[i]=sc.nextInt();
        int ev=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]%2==0)
            {
                int pos=i,t=ar[i];
                for(int j=pos;j>ev;j--)
                    ar[j]=ar[j-1];
                ar[ev++]=t;
            }
        }
        for (int i : ar) {
            System.out.print(i+" ");
        }
    }
}
