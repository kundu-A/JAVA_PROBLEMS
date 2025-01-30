import java.util.*;
public class Matrix_SumAndPeoductOfRowAndColumn {
    public static void sumAndProduct(int ar[][]){
        for(int i=0;i<ar.length;i++){
            int rowSum=0,rowProduct=1;
            for(int j=0;j<ar[i].length;j++){
                rowSum+=ar[i][j];
                rowProduct*=ar[i][j];
            }
            System.out.println("Row : "+(i+1)+" sum = "+rowSum+" , product = "+rowProduct);
            int columnSum=0,columnProduct=1;
            for(int j=0;j<ar[i].length;j++){
                columnSum+=ar[j][i];
                columnProduct*=ar[j][i];
            }
            System.out.println("Column : "+(i+1)+" sum = "+columnSum+" , product = "+columnProduct);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the row of the matrix: ");
        int row=sc.nextInt();
        System.out.println("Please enter the size of the column of the matrix: ");
        int column=sc.nextInt();
        int ar[][]=new int[row][column];
        System.out.println("Please enter values in the matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                ar[i][j]=sc.nextInt();
        }
        sumAndProduct(ar);
        sc.close();
    }
}
