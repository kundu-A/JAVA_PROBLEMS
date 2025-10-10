import java.util.Arrays;
import java.util.Scanner;

public class FindingLargestValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Largest Value: "+ar[findLargestValueIndex(ar)]+" and the index value is: "+findLargestValueIndex(ar));
        System.out.println("Largest Value: "+(findLargestValue(ar)+1));
        sc.close();
    }
    public static int findLargestValue(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
    public static int findLargestValueIndex(int[] nums){
        int maxValue=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(maxValue<nums[i]){
                maxValue=nums[i];
                index=i;
            }
        }
        return index;
    }
}   
