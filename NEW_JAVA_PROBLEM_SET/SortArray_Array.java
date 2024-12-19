import java.util.*;
class Solution{
    public void sortInAscendingOrder(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
    public void sortInDecendingOrder(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}
public class SortArray_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        Solution solution=new Solution();
        System.out.println("Your sorted array in Ascending order: ");
        solution.sortInAscendingOrder(ar);
        for (int i : ar) 
            System.out.print(i+" ");
        System.out.println("\nYour sorted array in Decending order: ");
        solution.sortInDecendingOrder(ar);
        for(int i : ar)
            System.out.print(i+" ");
        sc.close();
    }
}
