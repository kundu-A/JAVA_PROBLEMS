/*
Pattern Shape:
    1
   12
  123
 1234
12345
 */
import java.util.*;
public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the pattern: ");
        int size=sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size-i;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print(k);
            System.out.println();
        }
        sc.close();
    }
}
