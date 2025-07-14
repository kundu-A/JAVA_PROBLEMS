//Implementing Selection Sort using Arrya
//https://www.w3schools.com/dsa/dsa_algo_selectionsort.php -> Learn the algorithm
/*
 * Let array = [7,12,9,11,3]
 * Iteration -1:
 *          min=7
 *          Step 1: 12<min -----> No
 *          Step 2: 9<min -----> No 
 *          Step 3: 11<min -----> No
 *          Step 4: 3>min -----> Yes ---> min=3
 *      Swap 7 with 3 ---> [3,12,9,11,7]
 * Iteration 1 complete - We found lowest element 3 at the front.
 */
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("We are going to perform Selection Sort....");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the arrya: ");
        int size=sc.nextInt();
        int[] ar=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
        int[] result=makeSelectionSort(ar);
        System.out.println("Your sorted array is....");
        for (int i : result) {
            System.out.print(i+" ");
        }
        System.out.println("\nSelection Sort in complete now... Program is end.");
        sc.close();
    }

    public static int[] makeSelectionSort(int[] ar){
        int size=ar.length;
        //This Outer loop is for Iteration - it operates how many times the inner loops will run.
        for(int i=0;i<size;i++){
            int min=i;
            //This Inner loop for steps - here we find the minimum value.
            for(int j=i+1;j<size;j++){
                if(ar[j]<ar[min])
                    min=j;
            }
            //Here we swap the ith element with that minimum value.
            if(min!=i){
                int temp=ar[i];
                ar[i]=ar[min];
                ar[min]=temp;
            }
        }
        return ar;
    }
}
