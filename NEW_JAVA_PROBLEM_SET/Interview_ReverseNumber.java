import java.util.*;
public class Interview_ReverseNumber {
    public static int reverse(int num){
        int sum=0;
        while (num>0) {
            int temp=num%10;
            sum=10*sum+temp;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num=sc.nextInt();
        System.out.println("The reverse form is: "+reverse(num));
        sc.close();
    }
}
