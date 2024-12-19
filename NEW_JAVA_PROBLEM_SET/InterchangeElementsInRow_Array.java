/*
Input  :  1  1  5  0
          2  3  7  2
          8  9  1  3
          6  7  8  2
          
Output :  6  7  8  2
          2  3  7  2 
          8  9  1  3
          1  1  5  0
 */
import java.util.*;
class Solution{
    public static void interchangeElements(int nums[][]){
        for(int i=0;i<1;i++){
            for(int j=0;j<nums[i].length;j++){
                int temp=nums[i][j];
                nums[i][j]=nums[nums.length-1][j];
                nums[nums.length-1][j]=temp;
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++)
                System.out.print(nums[i][j]+" ");
            System.out.println();
        }
    }
}
public class InterchangeElementsInRow_Array {
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
        Solution.interchangeElements(ar);
        sc.close();
    }
}
