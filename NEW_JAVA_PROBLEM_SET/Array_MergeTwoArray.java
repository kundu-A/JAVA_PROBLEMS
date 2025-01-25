import java.util.*;
public class Array_MergeTwoArray {
    public static int[] merge(int nums1[],int nums2[]){
        int result[]=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while ((j!=nums1.length) && (k!=nums2.length)) {
            if(nums1[j]<nums2[k])
                result[i++]=nums1[j++];
            else
                result[i++]=nums2[k++];
        }
        while (j!=nums1.length) {
            result[i++]=nums1[j++];
        }
        while (k!=nums2.length) {
            result[i++]=nums2[k++];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the 1st array: ");
        int size1=sc.nextInt();
        System.out.println("Please enter the size of the 2nd array: ");
        int size2=sc.nextInt();
        int ar1[]=new int[size1];
        int ar2[]=new int[size2];
        System.out.println("Please enter values in 1st array: ");
        for(int i=0;i<size1;i++)
            ar1[i]=sc.nextInt();
        System.out.println("Please enter values in 2nd array: ");
        for(int i=0;i<size2;i++)
            ar2[i]=sc.nextInt();
        int result[]=merge(ar1, ar2);
        for (int i : result) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
