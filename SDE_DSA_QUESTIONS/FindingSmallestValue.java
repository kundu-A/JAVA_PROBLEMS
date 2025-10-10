import java.util.Arrays;
import java.util.Scanner;

public class FindingSmallestValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Smalest Value is: "+ar[findSmallestValueIndex(ar)]+" and the index is: "+(findSmallestValueIndex(ar)+1));
        System.out.println("Smallest Value is: "+findSmallestValue(ar));
        sc.close();
    }
    public static int findSmallestValue(int[] ar){
        Arrays.sort(ar);
        return ar[0];
    }
    public static int findSmallestValueIndex(int[] ar){
        int minValue=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<ar.length;i++){
            if(minValue>ar[i]){
                minValue=ar[i];
                index=i;
            }
        }
        return index;
    }
}
