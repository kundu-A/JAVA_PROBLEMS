import java.util.*;
public class Interview_SecondLargest {
    public static int secondLargest(int ar[]){
        if(ar.length<=0){
            System.out.println("Invalid Array.");
            return 0;
        }
        if(ar.length==1){
            System.out.println("To find out the 2nd largest element in the array , presence of two number is important.");
            return ar[0];
        }
        Arrays.sort(ar);
        return ar[1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("The 2nd largest number is: "+secondLargest(ar)); 
        sc.close(); 
    } 
}
