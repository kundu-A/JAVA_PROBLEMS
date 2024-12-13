//Add two matrix
import java.util.*;
class Solution{
    public void addMatrices(int nums1[][],int nums2[][]){
        int result[][]=new int[nums1.length][nums1[0].length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums1[i].length;j++)
                result[i][j]=nums1[i][j]+nums2[i][j];
        }
        System.out.println("Result of two matrics is: ");
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result.length;j++)
                System.out.print(result[i][j]+" ");
            System.out.println();
        }
    }
}
public class AddTwoMatrix_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the row: ");
        int row=sc.nextInt();
        System.out.println("Please enter the size of the column: ");
        int column=sc.nextInt();
        int ar1[][]=new int[row][column];
        int ar2[][]=new int[row][column];
        System.out.println("Please enter values in 1st Matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                ar1[i][j]=sc.nextInt();
        }
        System.out.println("Please enter values in 2nd Matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                ar2[i][j]=sc.nextInt();
        }
        Solution solution=new Solution();
        solution.addMatrices(ar1, ar2);
        sc.close();
    }
}
