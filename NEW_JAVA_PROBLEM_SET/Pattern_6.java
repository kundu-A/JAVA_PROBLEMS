/*
    Pattern Shape:
    A B C D E 
    A B C D 
    A B C 
    A B 
    A
 */
import java.util.*;
public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the pattern: ");
        int size=sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size-i+1;j++)
                System.out.print((char)(65+j-1)+" ");
            System.out.println();
        }
        sc.close();
    }
}
