import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("We are going to implement Binary Search.....");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Please enter the target value: ");
        int target=sc.nextInt();
        int isFound=makeBinarySearch(ar,target);
        if(isFound==-1)
            System.out.println("The target element is not found");
        else
            System.out.println("Target element is found at : "+isFound);
        sc.close();
    }

    public static int makeBinarySearch(int[] ar, int target){
        int left=0;
        int right=ar.length-1;
        while (left<=right) {
            int mid=(left+right)/2;
            if(target==ar[mid])
                return mid;
            if(target<ar[mid])
                right=mid-1;
            else
                left=mid+1;
        }
        return -1;
    }
}
