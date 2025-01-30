import java.util.*;
public class Matrix_MatrixTranspose {
    public static void transpose(int ar[][]){
        for(int i=0;i<ar.length;i++){
            for(int j=i;j<ar[i].length;j++){
                int temp=ar[i][j];
                ar[i][j]=ar[j][i];
                ar[j][i]=temp;
            }
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
        transpose(ar);
        System.out.println("Transposed Matrix is: ");
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++)
                System.out.print(ar[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
