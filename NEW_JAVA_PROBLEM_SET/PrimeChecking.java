import java.util.Scanner;
class Solution{
    public static boolean prime(int num){
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }  
    public static void primeInRange(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a range(1st lower index and 2nd upper index) from which you want to find Prime numbers: ");
        int lowerRange=sc.nextInt();
        int upperRange=sc.nextInt();
        for(int i=lowerRange;i<=upperRange;i++){
            int temp=i,flag=0;
            for(int j=2;j<=temp/2;j++){
                if(temp%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.print(i+" ");
        }
        sc.close();
    } 
}
public class PrimeChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number to check id it prime or not: ");
        int input=sc.nextInt();
        if(Solution.prime(input)==true)
            System.out.println(input+" is prime.");
        else 
            System.out.println(input+" is not prime.");
        Solution.primeInRange();
        sc.close();
    }
}
