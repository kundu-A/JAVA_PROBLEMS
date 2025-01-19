import java.util.*;
public class Array_LocalMaxima {
    public static void findMaxima(int ar[]){
        for(int i=1;i<=ar.length-2;i++){
            if((ar[i]>ar[i-1]) && (ar[i]>ar[i+1]))
                System.out.println("The Local maxima is: "+ar[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
        findMaxima(ar);
        sc.close();
    }
}
