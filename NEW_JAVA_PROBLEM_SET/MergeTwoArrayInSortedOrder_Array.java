//TechMonastic Interview Questions
//This is not good approach to perform merge two arrays in sorted order.We have to do like this: While inserting values from two arrays into the big array it will be in sorted order.
import java.util.*;
class Solution{
    public static void sortMergeArrays(int nums1[],int nums2[]){
        int merged[]=new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++)
            merged[k++]=nums1[i];
        for(int i=0;i<nums2.length;i++)
            merged[k++]=nums2[i];
        Arrays.sort(merged);
        for (int i : merged) {
            System.out.print(i+" ");
        }
    }
}
public class MergeTwoArrayInSortedOrder_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the 1st Array: ");
        int size1=sc.nextInt();
        int ar1[]=new int[size1];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size1;i++)
            ar1[i]=sc.nextInt();
        System.out.println("Please enter the size of the 2nd Array: ");
        int size2=sc.nextInt();
        int ar2[]=new int[size2];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size2;i++)
            ar2[i]=sc.nextInt();
        Solution.sortMergeArrays(ar1, ar2);
        sc.close(); 
    }
}
