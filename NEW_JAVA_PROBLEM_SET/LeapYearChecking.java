import java.util.*;
class Solution{
    public static boolean isLeapYear(int year){
        if(year%4==0 && year%100!=0 || year%400==0)
            return true;
        else
            return false;
    }
}
public class LeapYearChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a year to check is it a Leap Year or not? : ");
        int year=sc.nextInt();
        System.out.println("CHECKING A YEAR IS LEAP YEAR OR NOT!!!");
        boolean leapYear=Solution.isLeapYear(year);
        if(leapYear==true)
            System.out.println(year+" is Leap Year.");
        else
            System.out.println(year+" is not Leap Year.");
        sc.close();
    }
}
