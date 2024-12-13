//Checking both matrices are equals are not.
import java.util.*;;
public class CheckingSameMatrices_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the row: ");
        int row=sc.nextInt();
        System.out.println("Please enter the size of the column: ");
        int column=sc.nextInt();
        int ar1[][]=new int[row][column];
        int ar2[][]=new int[row][column];
        System.out.println("Please enter values in the 1st array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                ar1[i][j]=sc.nextInt();
        }
        System.out.println("Please enter values in the 2nd array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                ar2[i][j]=sc.nextInt();
        }
        if(Arrays.deepEquals(ar1, ar2))
            System.out.println("Both are equals!!");
        else
            System.out.println("Both are not equals!!");
        sc.close();
    }
}
