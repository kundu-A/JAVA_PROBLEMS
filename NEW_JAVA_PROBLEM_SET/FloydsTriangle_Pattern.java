/*
    Pattern Shape:
    1  
    2 3  
    4 5 6  
    7 8 9 10
 */
import java.util.*;
public class FloydsTriangle_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a range: ");
        int range=sc.nextInt();
        int c=1;
        System.out.println("Your Floyd's Triangle is: ");
        for(int i=0;i<range;i++){
            for(int j=0;j<=i;j++)
                System.out.print(c+++" ");
            System.out.println();
        }
        sc.close();
    }
}
