//Implementing Bubble Sort using Arrya
//https://www.w3schools.com/dsa/dsa_algo_bubblesort.php -> Learn the algorithm
/*
 * Let array = [7,12,9,11,3]
 * Iteration -1:
 *          Step 1: 7>12 -----> No
 *          Step 2: 12>9 -----> Yes ---> [7,9,12,11,3]
 *          Step 3: 12>11 -----> Yes ---> [7,9,11,12,3]
 *          Step 4: 12>3 -----> Yes ---> [7,9,11,3,12]
 * Iteration 1 complete - We found largest element 12 at the end.
 */
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("We are going to perform Bubble Sort....");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the arrya: ");
        int size=sc.nextInt();
        int[] ar=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
        int[] result=makeBubbleSort(ar);
        System.out.println("Your sorted array is....");
        for (int i : result) {
            System.out.print(i+" ");
        }
        System.out.println("\nBubble Sort in complete now... Program is end.");
        sc.close();
    }

    public static int[] makeBubbleSort(int[] ar){
        int size=ar.length;
        int a=0,b=0;
        //This outer loop is resposible for Interation.
        for(int i=0;i<size-1;i++){
            //This innter loop is responsible for Steps.
            for(int j=0;j<size-1-i;j++){
                a=ar[j];
                b=ar[j+1];
                if(a>b){
                    ar[j]=b;
                    ar[j+1]=a;
                }
            }
        }
        return ar;
    }
}
