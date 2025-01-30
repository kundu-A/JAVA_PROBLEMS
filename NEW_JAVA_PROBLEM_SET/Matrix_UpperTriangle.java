import java.util.*;
public class Matrix_UpperTriangle {
    public static void upperTriangle(int nums[][]){
        int result[][]=new int[nums.length][nums[0].length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i;j++)
                result[i][j]=nums[i][j];
        }
        System.out.println("The Lower Triangle is: ");
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++)
                System.out.print(result[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the row: ");
        int row=sc.nextInt();
        System.out.println("Please enter the size of the column: ");
        int column=sc.nextInt();
        int ar[][]=new int[row][column];
        System.out.println("Please enter values in the matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                ar[i][j]=sc.nextInt();
        }
        upperTriangle(ar);
        sc.close();
    }
}
