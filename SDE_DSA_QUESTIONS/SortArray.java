import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int[] ar=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        int[] result=sort(ar);
        System.out.println("Sorted Array: ");
        for (int i : result)
            System.out.print(i+" ");
        sc.close();
    }
    public static int[] sort(int[] ar){
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]>ar[j]){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        return ar;
    }
}
