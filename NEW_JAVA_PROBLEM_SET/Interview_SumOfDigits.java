import java.util.*;
public class Interview_SumOfDigits {
    public static int sumOfDigits(int num){
        int sum=0;
        while (num>0) {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num=sc.nextInt();
        System.out.println("No. of digits: "+sumOfDigits(num));
        sc.close();
    }
}
