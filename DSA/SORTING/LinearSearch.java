//Implementing Linear Search using array.
//https://www.w3schools.com/dsa/dsa_algo_linearsearch.php -> Learn the algorithm.

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("We are going to perform Linear Search.....");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Please enter the target element to search: ");
        int target=sc.nextInt();
        boolean isFound=makeLinearSearch(ar, target);
        if(isFound)
            System.out.println("You target element is present in the array.");
        else
            System.out.println("You target element is not present in the array.");
        System.out.println("\nLinear Search is done...... Program is end");
        sc.close();
    }

    public static boolean makeLinearSearch(int[] ar,int target){
        for(int i=0;i<ar.length;i++){
            if(ar[i]==target)
                return true;
        }
        return false;
    }
}