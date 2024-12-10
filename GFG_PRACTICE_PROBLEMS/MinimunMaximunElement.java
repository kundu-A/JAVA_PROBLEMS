import java.util.Arrays;
import java.util.Scanner;

public class MinimunMaximunElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in th array: ");
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
        solution(ar);
        sc.close();
    }
    public static void solution(int ar[]){
        Arrays.sort(ar);
        System.out.println("Minimun element is : "+ar[0]+" and Maximum element is: "+ar[ar.length-1]);
    }
}
