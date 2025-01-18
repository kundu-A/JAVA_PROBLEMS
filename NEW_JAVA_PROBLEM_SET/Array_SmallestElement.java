import java.util.*;
public class Array_SmallestElement {
    public static int smallestElement(int ar[]){
        int min=ar[0];
        for(int i=0;i<ar.length;i++){
            if(min>ar[i])
                min=ar[i];
        }
        return min;
    }
    public static int secondSmallestElement(int ar[]){
        int min=ar[0];
        for(int i=0;i<ar.length;i++){
            if(min>ar[i])
                min=ar[i];
        }
        int min2=ar[0];
        for(int i=0;i<ar.length;i++){
            if(min2>ar[i]){
                if(min<ar[i])
                    min2=ar[i];
            }
        }
        return min2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("The smallest element is: "+smallestElement(ar));
        System.out.println("The 2nd smallest element is: "+secondSmallestElement(ar));
        sc.close();
    }
}
