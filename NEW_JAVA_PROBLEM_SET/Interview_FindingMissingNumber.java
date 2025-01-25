import java.util.*;
public class Interview_FindingMissingNumber {
    public static int missingNumber(int ar[]){
        if(ar.length<=0){
            System.out.println("Please provide valid size.");
            return 0;
        }
        int n=ar.length+1;
        int total=n*(n+1)/2;
        for (int i : ar) {
            total=total-i;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("The missing element is: "+missingNumber(ar));
        sc.close();
    }
}
