//Implementing the Merge Sort using Array
//https://www.w3schools.com/dsa/dsa_algo_mergesort.php -> Learn the algorithm
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("We are going to perform Merge Sort....");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the arrya: ");
        int size=sc.nextInt();
        int[] ar=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
        int result[]=makeMergeSort(ar);
        System.out.println("Your sorted array is....");
        for (int i : result) {
            System.out.print(i+" ");
        }
        System.out.println("\nMerge Sort in complete now... Program is end.");
        sc.close();
    }
    public static int[] makeMergeSort(int[] ar){
        if(ar.length<=1)
            return ar;

        int mid=ar.length/2;

        int[] leftHalf=Arrays.copyOfRange(ar, 0, mid);
        int[] righthalf=Arrays.copyOfRange(ar, mid, ar.length);

        int [] sortedLeft=makeMergeSort(leftHalf);
        int[] sortedRight=makeMergeSort(righthalf);
        
        return merge(sortedLeft,sortedRight);
    }
    public static int[] merge(int[] left, int[] right){
        int[] result=new int[left.length+right.length];
        int i=0,j=0,k=0;
        while (i<left.length && j<right.length) {
            if(left[i]<right[j])
                result[k++]=left[i++];
            else
                result[k++]=right[j++];
        }
        while(i<left.length)
            result[k++]=left[i++];
        while(j<right.length)
            result[k++]=right[j++];
        return result;
    }
}
