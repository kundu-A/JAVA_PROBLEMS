//Sum of both diagonals.
/*
Given Matrix: 
1 2 3
1 2 3
1 2 3
Output: 1+2+3=6 and 3+2+1=6
*/
import java.util.*;
class Solution{
    public static int[] findDiagonal(int[][] nums){
        int result[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(i==j)
                    result[0]=result[0]+nums[i][j];
                if((i+j+1)==nums.length)
                    result[1]=result[1]+nums[i][j];
            }
        }
        return result;
    }
}
public class SumOfDiagonals_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the size: ");
        int size=sc.nextInt();
        int ar[][]=new int[size][size];
        System.out.println("please enter values in Matri: ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++)
                ar[i][j]=sc.nextInt();
        }
        int result[]=Solution.findDiagonal(ar);
        for (int i : result) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
