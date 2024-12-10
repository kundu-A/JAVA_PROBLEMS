/*
Pattern Shape:
    A 
   A B 
  A B C 
 A B C D 
A B C D E 
 */
import java.util.*;
public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the pattern: ");
        int size=sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size-i;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print((char)(65+k-1)+" ");
            System.out.println();
        }
        sc.close();
    }
}
