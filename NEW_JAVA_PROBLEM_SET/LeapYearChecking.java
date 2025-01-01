import java.util.*;
class Solution{
    public static boolean isLeapYear(int year){
        if(year%4==0 && year%100!=0 || year%400==0)
            return true;
        else
            return false;
    }
    public static int extractLastTwoDigit(int year){
        String temp=String.valueOf(year);
        String result="";
        result=result+temp.charAt(temp.length()-2)+temp.charAt(temp.length()-1);
        return Integer.parseInt(result);
    }
    public static void convertDays(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter Days into Year , Month and Days: ");
        int day=sc.nextInt();
        int year=day/365;
        int weeks=(day-(year*365))/7;
        int days=(day-(year*365))%7;
        System.out.println(day+" days = "+"\nYear = "+year+" ,Weeks = "+weeks+" ,Days = "+days);
        sc.close();
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
        System.out.println("Last two digits = "+Solution.extractLastTwoDigit(year));
        Solution.convertDays();
        sc.close();
    }
}
