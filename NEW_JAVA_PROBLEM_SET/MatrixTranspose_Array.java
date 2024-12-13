//Tranpose a Matrix
import java.util.Scanner;
class Solution{
    public static void transpose(int nums[][]){
        int result[][]=new int[nums[0].length][nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++)
                result[j][i]=nums[i][j];
        }
        System.out.println("Transposed Matrix is: ");
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++)
                System.out.print(result[i][j]+" ");
            System.out.println();
        }
    }
}
public class MatrixTranspose_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the row: ");
        int row=sc.nextInt();
        System.out.println("Please enter the size of the column: ");
        int column=sc.nextInt();
        int ar[][]=new int[row][column];
        System.out.println("Please enter values in the 2D matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                ar[i][j]=sc.nextInt();
        }
        System.out.println("Original Matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                System.out.print(ar[i][j]+" ");
            System.out.println();
        }
        Solution.transpose(ar);
        sc.close();
    }
}
