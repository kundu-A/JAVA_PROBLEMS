import java.util.*;
public class Array_CountOccurance {
    public static int count(int ar[],int key){
        int c=0;
        for (int i : ar) {
            if(i==key)
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Please enter key element: ");
        int key=sc.nextInt();
        int count=count(ar, key);
        System.out.println(key+" is present "+count+" times.");
        sc.close();
    }
}
