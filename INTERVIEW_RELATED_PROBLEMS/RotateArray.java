import java.util.*;
public class RotateArray {
    public static int[] rotateArray(int ar[],int key){
        int result[]=new int[ar.length];
        int k=0;
        for(int i=key;i<ar.length;i++)
            result[k++]=ar[i];
        for(int i=0;i<key;i++)
            result[k++]=ar[i];
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Please enter the key: ");
        int key=sc.nextInt();
        int result[]=rotateArray(ar, key);
        System.out.println("Rotate Array is: ");
        for (int i : result) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}