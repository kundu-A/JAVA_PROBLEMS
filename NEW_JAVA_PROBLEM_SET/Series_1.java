import java.util.*;
public class Series_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a range to print the series: ");
        int range=sc.nextInt();
        System.out.println("Your pattern is: ");
        for(int i=1;i<=range;i++){
            System.out.print(1+"/"+i+" ");
        }
        sc.close();
    }
}
