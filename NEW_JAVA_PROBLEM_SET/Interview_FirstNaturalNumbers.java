import java.util.*;
public class Interview_FirstNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the range: ");
        int n=sc.nextInt();
        System.out.println("Natural numbers are: ");
        for(int i=1;i<=n;i++)
            System.out.print(i+" ");
        System.out.println("Sum = "+(n*(n+1))/2);
        sc.close();
    }
}
