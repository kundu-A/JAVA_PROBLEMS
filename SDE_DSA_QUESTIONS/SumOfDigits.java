import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num=sc.nextInt();
        System.out.println("Sum of digits = "+sum(num));
        System.out.println("Sum of digit: "+sumOfDigit(num));
        sc.close();
    }
    public static int sum(int num){
        int add=0;
        while (num>0) {
            add=add+num%10;
            num=num/10;
        }
        return add;
    }
    public static int sumOfDigit(int num){
        return String.valueOf(num)
                        .chars()
                        .map(c->c-'0')
                        .sum();
    }
}
