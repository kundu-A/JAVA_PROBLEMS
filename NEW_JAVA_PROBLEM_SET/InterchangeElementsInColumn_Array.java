/*
Input :     1  2  3  4
            5  6  7  8
            9  10  11  12
            13  14  15  16

Output :    4  2  3  1
            8  6  7  5
            12  10  11  9
            16  14  15  13
 */
import java.util.*;
class Solution{
    public static int[][] interchangeElements(int nums[][]){
        int result[][]=new int[nums.length][nums[0].length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<1;j++){
                int temp=nums[i][j];
                nums[i][j]=nums[i][nums.length-1];
                nums[i][nums.length-1]=temp;
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++)
                result[i][j]=nums[i][j];
        }
        return result;
    }
}
public class InterchangeElementsInColumn_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the row: ");
        int row=sc.nextInt();
        System.out.println("Please enter the size of the column: ");
        int column=sc.nextInt();
        int ar[][]=new int[row][column];
        System.out.println("Please enter values in the Matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                ar[i][j]=sc.nextInt();
        }
        int result[][]=Solution.interchangeElements(ar);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++)
                System.out.print(result[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
