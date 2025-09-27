/*  Problem Statement - Merge Intervals
    Problem: Given a collection of intervals, merge all overlapping intervals. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeInterval {
    public static void main(String[] args) {
        System.out.println("Problem = Merge Interval");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the row: ");
        int row=sc.nextInt();
        System.out.println("Please enter the size of the column: ");
        int column=sc.nextInt();
        int[][] nums=new int[row][column];
        System.out.println("Please enter values in matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                nums[i][j]=sc.nextInt();
        }
        List<int[]> result=solution(nums);
        System.out.println("Merged result is: ");
        for(int i=0;i<result.size();i++){
            for(int j=0;j<result.get(i).length;j++)
                System.out.print(result.get(i)[j]+" ");
            System.out.println();
        }
        sc.close();
    }
    public static List<int[]> solution(int[][] nums){
        List<int[]> listArray = new ArrayList<>();
        listArray.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int[] lastInterval = listArray.get(listArray.size() - 1);
            int prevFirstValue = lastInterval[0];
            int prevLastValue = lastInterval[lastInterval.length - 1];
            int currentFirstValue = nums[i][0];
            int currentLastValue = nums[i][nums[i].length - 1];
            if (currentFirstValue <= prevLastValue)
                listArray.set(listArray.size() - 1, new int[]{prevFirstValue, Math.max(prevLastValue, currentLastValue)});
            else
                listArray.add(nums[i]);
        }
        return listArray;
    }
}
