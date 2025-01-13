import java.util.*;
class Solution{

    public static void simpleInterest(double amount ,double interest , double time){
        double result=(amount*time*interest)/100;
        System.out.println(result);
    }
    public static void complexInterest(double amount ,double interest , double time){
        double result=amount*(1+Math.pow((interest/100), time));
        System.out.println(result);
    }
}
public class IntersetCalculations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the amount: ");
        double amount=sc.nextInt();
        System.out.println("Please enter the rate of interest: ");
        double interest=sc.nextInt();
        System.out.println("Total time periods: ");
        double time=sc.nextInt();
        Solution.complexInterest(amount,interest,time);
        Solution.simpleInterest(amount,interest,time);
        sc.close();
    }
}
