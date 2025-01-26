import java.util.*;
public class Interview_PerfectNumber {
    public static int isPerfectNumber(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
                sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num=sc.nextInt();
        int result=isPerfectNumber(num);
        if(result==num)
            System.out.println(num+" is Perfect number.");
        else
            System.out.println(num+" is not a Perfect number.");
        sc.close();
    }
}
