import java.util.*;
public class Array_largestElement {
    public static int largestElement(int ar[]){
        int max=-1;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }
    public static int secondLargesElement(int ar[]){
        int max=-1;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max)
                max=ar[i];
        }
        int max2=-1;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max2){
                if(ar[i]<max)
                    max2=ar[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("The Largest element is: "+largestElement(ar));
        System.out.println("The 2nd Largest element is: "+secondLargesElement(ar));
        sc.close();
    }
}
