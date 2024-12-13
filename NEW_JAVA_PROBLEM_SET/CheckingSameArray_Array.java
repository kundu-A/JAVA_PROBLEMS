//Check that both array elements are equal or not.
import java.util.*;
public class CheckingSameArray_Array {
    public static void bruteForceApproach(int nums1[],int nums2[]){
        if(nums1.length!=nums2.length){
            System.out.println("Length of the first array is "+nums1.length+" and Length of the second array is "+nums2.length+" so both are not equal!!");
            return;
        }
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=nums2[i]){
                System.out.println("A mismatch found!! At "+(i+1)+" position 1st Array have "+nums1[i]+" and 2n Array have "+nums2[i]+" so both are not equal!!");
                return;
            }
        }
        System.out.println("Both are equal!!");
    }
    public static void shortWays(int nums1[],int nums2[]){
        if(nums1.length!=nums2.length){
            System.out.println("Length of the first array is "+nums1.length+" and Length of the second array is "+nums2.length+" so both are not equal!!");
            return;
        }
        if(Arrays.equals(nums1, nums2))
            System.out.println("Both are equal!!");
        else
            System.out.println("Both are not equal!!");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the First Array: ");
        int size1=sc.nextInt();
        int ar1[]=new int[size1];
        System.out.println("Please enter values in the 1st array:");
        for(int i=0;i<size1;i++)
            ar1[i]=sc.nextInt();
        System.out.println("Please enter the size of the second array: ");
        int size2=sc.nextInt();
        int ar2[]=new int[size2];
        System.out.println("Please enter values in 2nd the array: ");
        for(int i=0;i<size2;i++)
            ar2[i]=sc.nextInt();
        System.out.println("By using Brute Force Approach: ");
        bruteForceApproach(ar1, ar2);
        System.out.println("By using in-bulit methods: ");
        shortWays(ar1, ar2);
        sc.close();
    }
}
