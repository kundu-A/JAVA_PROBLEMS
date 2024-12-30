import java.util.*;
class Solution{
    public static boolean isPerfect(int nums){
        int store=nums;
        int sum=0;
        for(int i=1;i<=nums/2;i++){
            if(nums%i==0)
                sum=sum+i;
        }
        if(sum==store)
            return true;
        else
            return false;
    }
}
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number to check wheather it it Prime or not: ");
        int input=sc.nextInt();
        if(Solution.isPerfect(input)==true)
            System.out.println(input+" is a perfect number.");
        else
            System.out.println(input+" is not perfect number.");
        sc.close();
    }
}
