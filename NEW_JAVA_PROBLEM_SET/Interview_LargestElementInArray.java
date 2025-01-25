import java.util.*;
public class Interview_LargestElementInArray {
    public static int findLargest(int ar[]){
        if(ar.length<=0)
            return 0;
        if(ar.length==1)
            return ar[ar.length-1];
        int result=ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i]>result)
                result=ar[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("The largest element of the array is: "+findLargest(ar));
        sc.close();
    }
}
