import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int[] ar=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
        int[] result=arrayReverse(ar);
        for(int i : result)
            System.out.print(i+" ");
        System.out.println();
        int[] output=arrayReverse(ar);
        for(int i : output)
            System.out.print(i+" ");
        sc.close();
    }
    public static int[] arrayReverse(int[] ar){
        if(ar.length<=1)
            return ar;
        int[] result=new int[ar.length];
        int k=0;
        for(int i=ar.length-1;i>=0;i--)
            result[k++]=ar[i];
        return result;
    }
    public static int[] reverseArray(int[] ar){
        if(ar.length<=1)
            return ar;
        for(int i=0;i<ar.length/2;i++){
            int temp=ar[i];
            ar[i]=ar[ar.length-1-i];
            ar[ar.length-1-i]=temp;
        }
        return ar;
    }
}
