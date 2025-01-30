import java.util.*;
public class Matrix_MatrixMultiplication {
    public static void multiplication(int nums1[][],int nums2[][]){
        int result[][]=new int[nums1.length][nums1[0].length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2[i].length;j++){
                for(int k=0;k<nums1[i].length;k++)
                    result[i][j]+=nums1[i][k]*nums2[k][j];
            }
        }
        System.out.println("Result of Matrix multiplication: ");
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++)
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
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                ar[i][j]=sc.nextInt();
        }
        int ar1[][]=new int[row][column];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                ar1[i][j]=sc.nextInt();
        }
        multiplication(ar,ar1);
        sc.close();
    }
}
