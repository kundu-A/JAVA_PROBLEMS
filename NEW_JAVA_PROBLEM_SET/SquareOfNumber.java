import java.util.*;
class Solution{
    static Scanner sc=new Scanner(System.in);
    public static void makeSquare(){
        System.out.println("Please enter a number to make it square: ");
        int input=sc.nextInt();
        System.out.println("Square of "+input+" = "+input*input);
    }
    public static void makeSquareInRange(){
        System.out.println("Please enter a range to make square numbers: ");
        int range=sc.nextInt();
        for(int i=1;i<=range;i++)
            System.out.println("Square of "+i+" = "+Math.pow(i, 2));
    }
    public static void sumOfSquaredNumbers(){
        System.out.println("Please enter a range for summation of square numbers: ");
        int range=sc.nextInt();
        int sum=0;
        for(int i=1;i<=range;i++){
            int temp=(int)Math.pow(i, 2);
            System.out.print(temp+" ");
            sum=sum+temp;
        }
        System.out.println("\nSum of those squared numbers = "+sum);
    }
}
public class SquareOfNumber {
    public static void main(String[] args) {
        Solution.makeSquare();
        Solution.makeSquareInRange();
        Solution.sumOfSquaredNumbers();
    }
}
