import java.util.*;
public class AmrstrongNumber {
    public static void isAmrstrong(int input){
        int countDigit=0;
        int temp=input;
        while (temp>0) {
            countDigit++;
            temp=temp/10;
        }
        System.out.println(countDigit);
        int store=input;
        int p=1,sum=0;
        while (input>0) {
            int t=input%10;
            p=(int)Math.pow(t,countDigit);
            sum=sum+p;
            input=input/10;
        }
        if(store==sum)
            System.out.println("This is Armstrong number.");
        else
            System.out.println("This is not Armstrong.");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int input=sc.nextInt();
        isAmrstrong(input);
        sc.close();
    }
}
