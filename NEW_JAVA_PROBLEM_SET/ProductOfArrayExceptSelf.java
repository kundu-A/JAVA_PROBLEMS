/* Problem Statement- Return array where each element is product of all other elements (no division).
 * Example - [1,2,3,4] → [24,12,8,6]
 */

import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        int[] result=solution(ar);
        for (int i : result) {
            System.out.print(i+" ");
        }
        sc.close();
    }
    public static int[] solution(int[] nums){
        if(nums.length<=1)
            return nums;
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int prod=1;
            for(int j=0;j<nums.length;j++){
                if(i==j)
                    continue;
                prod=prod*nums[j];
            }
            result[i]=prod;
        }
        return result;
    }
}
