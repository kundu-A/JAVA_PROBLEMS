/* Problem Statement - Find the contiguous subarray with the largest sum and return the sum. */

import java.util.Scanner;

public class MaximumSubArray {
    public static void main(String[] args) {
        System.out.println("Problem = Sum of maximum subarray");
        Scanner sc=new Scanner(System.in);
        System.out.println("Pleasee enter the size of the array: ");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<nums.length;i++)
            nums[i]=sc.nextInt();
        int result1=solution1(nums);
        System.out.println("\nMaximum sum: "+result1);
        System.out.println("********************************************************");
        int result2=solution2(nums);
        System.out.println("\nMaximum sum: "+result2);
        sc.close();
    }
    public static int solution1(int[] nums){
        if(nums.length<=1)
            return nums[0];
        int maxSum=Integer.MIN_VALUE;
        int p=-1,q=-1;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum>maxSum){
                    maxSum=sum;
                    p=i;
                    q=j;
                }
            }
        }
        System.out.println("Sub Array is: ");
        for(int i=p;i<=q;i++)
            System.out.print(nums[i]+" ");
        return maxSum;
    }
    public static int solution2(int[] nums){
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
