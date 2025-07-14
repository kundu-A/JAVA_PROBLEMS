//Implemeting Insetion Sort using array.
//https://www.w3schools.com/dsa/dsa_algo_insertionsort.php -> Learn the algorithm
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("We are going to perform Insertion Sort....");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the arrya: ");
        int size=sc.nextInt();
        int[] ar=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
        int[] result=makeInsertionSort(ar);
        System.out.println("Your sorted array is....");
        for (int i : result) {
            System.out.print(i+" ");
        }
        System.out.println("\nInsertion Sort in complete now... Program is end.");
        sc.close();
    }

    public static int[] makeInsertionSort(int[] ar){
        int size=ar.length;
        for(int i=0;i<size;i++){
            int insert_index=i;
            int current_value=ar[i];
            for(int j=i-1;j>-1;j--){
                if(ar[j]>current_value){
                    ar[j+1]=ar[j];
                    insert_index=j;
                }
                else
                    break;
            }
            ar[insert_index]=current_value;
        }
        return ar;
    }
}
