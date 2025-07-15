//Implementing Selection Sort using Arrya
//https://www.w3schools.com/dsa/dsa_algo_quicksort.php -> Learn the algorithm
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println("We are going to perform Quick Sort....");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the arrya: ");
        int size=sc.nextInt();
        int[] ar=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
        makeQuickSort(ar,0,size-1);
        System.out.println("Your sorted array is....");
        for (int i : ar) {
            System.out.print(i+" ");
        }
        System.out.println("\nQuick Sort in complete now... Program is end.");
        sc.close();
    }

    //This method is used for recursion - if both base condition is false , the arrya is already sorted.
    public static void makeQuickSort(int[] ar, int low, int high){
        if(low<high){
            int pivot_index=partition(ar, low, high);
            //First base condition
            makeQuickSort(ar, low, pivot_index-1);
            //Secondly base condition
            makeQuickSort(ar, pivot_index+1, high);
        }
    }

    //Here we find the pivot index.
    //Pivot - A pivot is the element you choose from the array to compare other elements against during partitioning.
    public static int partition(int[] ar, int low, int high){
        int pivot=ar[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(ar[j]<pivot){
                i++;
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
            }
        }
        int temp=ar[i+1];
        ar[i+1]=ar[high];
        ar[high]=temp;
        return i+1;
    }
}
