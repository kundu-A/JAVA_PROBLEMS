import java.util.*;
public class CopyElementsFromArray_Array {
    public static int[] copy(int nums[]){
        int ar[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            ar[i]=nums[i];
        return ar;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        int result[]=copy(ar);
        System.out.println("Copied array elements are: ");
        for (int i : result) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
