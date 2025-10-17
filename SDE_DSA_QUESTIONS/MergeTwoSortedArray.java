import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the size of 1st array: ");
        int size1=sc.nextInt();
        int[] nums1=new int[size1];
        System.out.println("Please enter values in 1st array: ");
        for(int i=0;i<size1;i++)
            nums1[i]=sc.nextInt();

        System.out.println("Please enter the size of 2nd array: ");
        int size2=sc.nextInt();
        int nums2[]=new int[size2];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size2;i++)
            nums2[i]=sc.nextInt();
        
        int[] result=mergeTwoArray(nums1, nums2);
        System.out.println("After merging two array: ");
        for (int i : result) 
            System.out.print(i+" ");
        System.out.println();
        mergingTwoArray(nums1, nums2);
        sc.close();
    }
    public static int[] mergeTwoArray(int[] nums1,int[] nums2){
        int[] ar=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while (i<nums1.length && j<nums2.length) {
            if(nums1[i]<=nums2[j])
                ar[k++]=nums1[i++];
            else
                ar[k++]=nums2[j++];
        }
        while (i<nums1.length)
            ar[k++]=nums1[i++];
        while(j<nums2.length)
            ar[k++]=nums2[j++];
        return ar;
    }
    public static void mergingTwoArray(int[] nums1,int[] nums2){
        int[] result=new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++)
            result[k++]=nums1[i];
        for(int i=0;i<nums2.length;i++)
            result[k++]=nums2[i];
        Arrays.sort(result);
        System.out.println("After mergin two arrays: ");
        for (int i : result) 
            System.out.print(i+" ");
    }
}
