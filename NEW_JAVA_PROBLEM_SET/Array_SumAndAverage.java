import java.util.*;
public class Array_SumAndAverage {
    public static int findSum(int ar[]){
        int sum=0;
        for (int i : ar) {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        int sum=findSum(ar);
        int average=sum/(size-1);
        System.out.println("Sum of elements: "+sum+"\nAverage of elements: "+average);
        sc.close();
    }
}
