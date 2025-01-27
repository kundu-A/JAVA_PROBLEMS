import java.util.*;
public class Interview_LeapYear {
    public static boolean isLeapYear(int year){
        if((year%4==0 && year%100!=0) || (year%400==0))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a Year to Check that is Leap year or not: ");
        int year=sc.nextInt();
        if(isLeapYear(year))
            System.out.println("This is a Leap Year.");
        else
            System.out.println("This year is not leap year.");
        sc.close();
    }
}
