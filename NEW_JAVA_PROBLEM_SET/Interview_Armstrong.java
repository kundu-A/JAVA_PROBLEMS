import java.util.*;
public class Interview_Armstrong {
    public static void isArmstrong(int num){
        int check=num,digitcount=num;
        int sum=0;
        int noOfDigits=0;
        while (digitcount>0) {
            noOfDigits++;
            digitcount=digitcount/10;
        }
        while (num>0) {
            int temp=num%10;
            sum=sum+(int)Math.pow(temp,noOfDigits);
            num=num/10;
        }
        if(check==sum)
            System.out.println("This is Armstrong number");
        else
            System.out.println("This is not Armstrong number");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number to check is it Armstrong or not: ");
        int num=sc.nextInt();
        isArmstrong(num);
        sc.close();
    }
}
