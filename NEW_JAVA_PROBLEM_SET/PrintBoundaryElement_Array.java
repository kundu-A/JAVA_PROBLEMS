import java.util.*;
class Solution{
    public static int[][] boundary(int nums[][]){
        int result[][]=new int[nums.length][nums[0].length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(i==0 || j==0 || i==nums.length-1 || j==nums.length-1){
                    result[i][j]=nums[i][j];
                    System.out.print(nums[i][j]);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        return result;
    }
}
public class PrintBoundaryElement_Array {
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
        int result[][]=Solution.boundary(ar);
        System.out.println("The Boudary of this Matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                System.out.print(result[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
