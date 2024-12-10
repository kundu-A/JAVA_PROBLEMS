import java.util.*;
public class RotationPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n=sc.nextInt();
        System.out.println("Your input is: ");
        for(int i=1;i<=n;i++)
            System.out.print(i);
        System.out.println();
        System.out.println("Your output is: ");
        for(int i=1;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
                System.out.print(j);
            for(int k=1;k<=i;k++)
                System.out.print(k);
            System.out.println();
        }
    }
}
