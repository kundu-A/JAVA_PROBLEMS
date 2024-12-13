//Printing 2D array
import java.util.*;;
class Solution{
    public static void printArray(int nums[][]){
        System.out.println("Your Matix is : ");
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++)
                System.out.print(nums[i][j]+" ");
            System.out.println();
        }
    }
}
public class Print2DArray_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the row size: ");
        int row=sc.nextInt();
        System.out.println("Please enter the size of the column: ");
        int column=sc.nextInt();
        int ar[][]=new int[row][column];
        System.out.println("Please enter values in the matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                ar[i][j]=sc.nextInt();
        }
        Solution.printArray(ar);
        sc.close();
    }
}
