//Find Normal and Trace.
/*
Given Matrix:
1 2 3
1 2 3
1 2 3
Trace = 1+2+3=6
Normal = (1*1+2*2+3*3+1*1+2*2+3*3+1*1+2*2+3*3)^0.5 (means square root)
 */
import java.util.*;
class Solution{
    public static void solveTraceAndNormal(int nums[][]){
        int trace=0,normal=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(i==j)
                    trace=trace+nums[i][j];
                normal=normal+(nums[i][j]*nums[i][j]);
            }
        }
        normal=(int) Math.pow(normal,0.5);
        System.out.println("Trace ="+trace+" Normal = "+normal);
    }
}
public class FindNormalAndTrace_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the Matrix: ");
        int size=sc.nextInt();
        int ar[][]=new int[size][size];
        System.out.println("Please enter values in the Mtarix: ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++)
                ar[i][j]=sc.nextInt();
        }
        Solution.solveTraceAndNormal(ar);
        sc.close();
    }
}
