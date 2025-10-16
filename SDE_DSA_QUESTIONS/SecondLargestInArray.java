import java.util.Scanner;

public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int[] ar=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Second largest element: "+findSecondLargest(ar));
        sc.close();
    }
    public static int findSecondLargest(int[] ar){
        if(ar.length<=1){
            System.out.println("Please enter at least two values to get second largest element!!!!!");
            return -1;
        }
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>maxValue)
                maxValue=ar[i];
        }
        int secondMaxValue=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>secondMaxValue && ar[i]<maxValue)
                secondMaxValue=ar[i];
        }
        return secondMaxValue;
    }
}
