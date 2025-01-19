import java.util.*;
public class Interview_PrimeNumber {
    /*public static boolean usingRecursion(int num,int i){
        if(num<=1)
            return false;
        if(num<=3)
            return true;
        if(i==num/2){
            if(num%i==0)
                return false;
            else                                     This code is also applicable , but not so good approach.
                return true;
        }else{
            usingRecursion(num, i+1);
            if(num%i==0)
                return false;
            else
                return true;
        }
    }*/
    public static boolean usingRecursion(int num,int i){
        if(num<=1)
            return false;
        if(i*i>num)
            return true;
        if(num%i==0)
            return false;
        return usingRecursion(num, i+1);
    }
    public static boolean normalTechnique(int num){
        if(num<=1)
            return false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number to check it is prime or not: ");
        int num=sc.nextInt();
        System.out.println("Using Recursion: ");
        System.out.println(usingRecursion(num,2));
        System.out.println("Using Recursion: ");
        System.out.println(normalTechnique(num));
        sc.close();
    }
}
