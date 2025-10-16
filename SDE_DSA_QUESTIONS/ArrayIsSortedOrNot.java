import java.util.Scanner;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Press 1 to check in ascending order\tPress 2 to check in decending order: ");
        int ch=sc.nextInt();
        switch (ch) {
            case 1: System.out.println("Is that array sorted in ascending order: "
                                        +isSortedInAscendingOrder(ar));
                break;
            case 2: System.out.println("Is that array sorted in decending order: "
                                        +isSortedInDecendingOrder(ar));
                break;
            default: System.out.println("Please enter valid option....");
                break;
        }
        sc.close();
    }
    public static boolean isSortedInAscendingOrder(int[] ar){
        int flag=0;
        for(int i=0;i<ar.length-1;i++){
            if(ar[i]>ar[i+1]){
                flag=1;
                break;
            }
        }
        if(flag==0)
            return true;
        return false;
    }
    public static boolean isSortedInDecendingOrder(int[] ar){
        int flag=0;
        for(int i=ar.length-1;i>=1;i--){
            if(ar[i]>ar[i-1]){
                flag=1;
                break;
            }
        }
        if(flag==0)
            return true;
        return false;
    }
}
