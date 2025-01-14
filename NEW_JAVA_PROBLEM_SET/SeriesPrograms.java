import java.util.*;
class Solution{

    public static void Series_1(int range){
        int sum=0;
        for(int i=1;i<=range;i++){
            System.out.print(i+"^"+2+" ");
            sum=sum+(int)Math.pow(i, 2);
        }
        System.out.println("\nTotal sum of this series: "+sum);
    }
    public static void Series_2(int range){
        double sum=0;
        for(int i=1;i<=range;i++){
            int p=1;
            for(int j=1;j<=i;j++)
                p=p*j;
            System.out.print(i+"/"+p+"!"+" ");
            sum=sum+((double)i/p);
        }
        System.out.println("\nTotal sum of this series: "+sum);
    }
    public static void Series_3(int range){
        double sum=0;
        for(int i=1;i<=range;i++){
            int p=1;
            for(int j=1;j<=i;j++)
                p=p*j;
            System.out.print(1+"/"+i+"!"+" ");
            sum=sum+((double)1/p);
        }
        System.out.println("\nTotal sum of this series: "+sum);
    }
    public static void Series_4(int range){
        double sum=0;
        for(int i=1;i<=range;i++){
            System.out.print(1+"/"+(i*i)+" ");
            sum=sum+((double)1/(double)(i*i));
        }
        System.out.println("\nTotal sum of this series: "+sum);
    }
}
public class SeriesPrograms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the range: ");
        int range=sc.nextInt();
        Solution.Series_1(range);
        Solution.Series_2(range);
        Solution.Series_3(range);
        Solution.Series_4(range);
        sc.close();
    }
}
