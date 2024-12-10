import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
        solution(ar);
        sc.close();
    }
    public static void solution(int ar[]){
        for(int i=0;i<ar.length/2;i++){
            int temp=ar[i];
            ar[i]=ar[ar.length-1-i];
            ar[ar.length-1-i]=temp;
        }
        System.out.println("Your reverse arrray is: ");
        for (int i : ar) {
            System.out.print(i+" ");
        }
    }
}
