import java.util.*;
public class Interview_CommonInArrays {
    public static void findCommonElements(int nums1[],int nums2[]){
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j])
                    System.out.print(nums1[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please the size of the 1st array: ");
        int size1=sc.nextInt();
        int ar1[]=new int[size1];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size1;i++)
            ar1[i]=sc.nextInt();
        System.out.println("Please the size of the 1st array: ");
        int size2=sc.nextInt();
        int ar2[]=new int[size2];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size2;i++)
            ar2[i]=sc.nextInt();
        System.out.println("Common elemets are: ");
        findCommonElements(ar1, ar2);
        sc.close();
    }
}
