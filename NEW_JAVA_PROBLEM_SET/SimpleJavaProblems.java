import java.util.*;
class Solution{
    static Scanner sc=new Scanner(System.in);
    public static void isOddOrEven(){
        System.out.println("PERFORMING ODD/EVEN CHECKING METHOD!!!");
        System.out.println("Please enter a number to check Odd or Even: ");
        int input=sc.nextInt();
        if(input%2==0)
            System.out.println(input+" is even.");
        else
            System.out.println(input+" is odd.");
    }
    public static void sumOfOddEvenNumbers(){
        System.out.println("PERFORMING SUM OF ODD AND EVEN NUMBERS!!!");
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter value in the array which contains odds and evens: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        int odd=0,even=0,oddcount=0,evencount=0;
        for(int i=0;i<size;i++){
            if(ar[i]%2==0){
                even=even+ar[i];
                evencount++;
            }
            else{
                odd=odd+ar[i];
                oddcount++;
            }
        }
        System.out.println("Total number of Even is "+evencount+" and sum = "+even);
        System.out.println("Total number of Odd is "+oddcount+" and sum = "+odd);
    }
    public static void isPositive(){
        System.out.println("PERFORMING TO CHECK A NUMBER IS POSITIVE OR NOT METHOD!!!");
        System.out.println("Please enter a number which can be positive or negative: ");
        int input=sc.nextInt();
        if(input>0)
            System.out.println(input+" is positive.");
        else if(input<0)
            System.out.println(input+" is negative.");
        else if(input==0)
            System.out.println(input+" is Zero (Neither positive nor negative).");
    }
    public static void largestNumber(){
        System.out.println("PERFORMING THE LARGEST AMONG THREE NUMBERS!!!");
        System.out.println("Please enter three number to check the largest one: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3)
            System.out.println(num1+" is the largest.");
        else if(num2>num1 && num2>num3)
            System.out.println(num2+" is the largest.");
        else
            System.out.println(num3+" is the largest.");
    }
    public static void swap(){
        System.out.println("PERFORMING SWAP OPERATION OF TWO NUMBERS!!!");
        System.out.println("Please enter 1st number: ");
        int num1=sc.nextInt();
        System.out.println("Please enter 2nd number: ");
        int num2=sc.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Now your 1st value is "+num1+" and your 2nd value is "+num2);
    }
    public static void isDivisibleBy5(){
        System.out.println("PERFORMING DIVISIBLE BY 5 METHOD!!!");
        System.out.println("Please enter a number to check is it divisible by 5: ");
        int input=sc.nextInt();
        if(input%5==0)
            System.out.println(input+" is divisible by 5.");
        else   
            System.out.println(input+" is not divisible by 5.");
    }
    public static void isEqual(){
        System.out.println("PERFORMING TWO NUMBERS ARE EQUAL OR NOT!!!");
        System.out.println("Please enter 1st number: ");
        int num1=sc.nextInt();
        System.out.println("Please enter 2nd number: ");
        int num2=sc.nextInt();
        if(num1==num2)
            System.out.println("Both are equals.");
        else
            System.out.println("Both are not equals.");
    }
    public static void sumOfDigitOfNumber(){
        System.out.println("PERFORMING SUM OF DIGITS OF A NUMBER!!!");
        System.out.println("Please enter a number: ");
        int input=sc.nextInt();
        int sum=0;
        while (input>0) {
            sum=sum+input%10;
            input=input/10;
        }
        System.out.println("Sum of digits of the provided number = "+sum);
    }
    public static void extractDigits(){
        System.out.println("PERFORMING EXTRACT DIGITS FROM A NUMBER METHOD: ");
        System.out.println("Please enter number: ");
        int input=sc.nextInt();
        while (input>0) {
            System.out.println(input%10);
            input=input/10;
        }
    }
    public static void incrementBy1(){
        System.out.println("PERFORMING INCREMENT BY 1 OF EVERY DIGITS IN A NUMBER!!!");
        System.out.println("Please a number: ");
        int input=sc.nextInt();
        int sum=0,extract=0;
        while (input>0) {
            extract=input%10;
            extract++;
            sum=sum*10+extract;
            input=input/10;
        }
        while (sum>0) {
            extract=sum%10;
            input=input*10+extract;
            sum=sum/10;
        }
        System.out.println(input);
    }
}
public class SimpleJavaProblems {
    public static void main(String[] args) {
        Solution.isOddOrEven();
        Solution.sumOfOddEvenNumbers();
        Solution.isPositive();
        Solution.largestNumber();
        Solution.swap();
        Solution.isDivisibleBy5();
        Solution.isEqual();
        Solution.sumOfDigitOfNumber();
        Solution.extractDigits();
        Solution.incrementBy1();
    }
}
