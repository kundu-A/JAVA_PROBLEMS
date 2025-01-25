import java.util.*;
public class FindLCM {
    public static int findLCM(int a,int b){
        int lcm=Math.max(a, b);
        while (lcm%a!=0 || lcm%b!=0) 
            lcm++;
        return lcm;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter two value: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int lcm=findLCM(a,b);
        System.out.println("The Greatest Common Divisor of "+a+" and "+b+" is: "+lcm);
        sc.close();
    }
}
