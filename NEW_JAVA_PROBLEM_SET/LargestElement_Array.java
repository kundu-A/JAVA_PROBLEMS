//Find out the largest element from the array
import java.util.*;
class Solution{
    public static int findLargest(int nums[]){
        if(nums.length<=0)
            return -1;
        if(nums.length==1)
            return nums[0];
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)
                max=nums[i];
        }
        return max;
    }
}
public class LargestElement_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        int result=Solution.findLargest(ar);
        if(result==-1)
            System.out.println("Array size is "+ar.length+" so it is not applicable.");
        else 
            System.out.println("The Largest element of the Given array is: "+result);
        sc.close();
    }
}