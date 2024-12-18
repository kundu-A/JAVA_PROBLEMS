import java.util.*;
class Solution{
    public static int[] merge(int nums1[],int nums2[]){
        int result[]=new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++)
            result[k++]=nums1[i];
        for(int i=0;i<nums2.length;i++)
            result[k++]=nums2[i];
        return result;
    }
}
public class MergeTwoArray_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the 1st array: ");
        int size1=sc.nextInt();
        int ar1[]=new int[size1];
        System.out.println("Please enter values in 1st array: ");
        for(int i=0;i<size1;i++)
            ar1[i]=sc.nextInt();
        System.out.println("Please enter the size of the 2nd array: ");
        int size2=sc.nextInt();
        int ar2[]=new int[size2];
        System.out.println("Please enter values in 2nd array: ");
        for(int i=0;i<size2;i++)
            ar2[i]=sc.nextInt();
        int[] result=Solution.merge(ar1,ar2);
        System.out.println("Merged array is: ");
        for(int i=0;i<result.length;i++)
            System.out.print(result[i]+" ");
        sc.close();
    }
}
