import java.util.*;
public class Interview_Factorial {
    public static int usingRecursion(int num){
        if(num==0)
            return 1;
        else{
            if(num==1)
                return 1;
            else
                return num*usingRecursion(num-1);
        }
    }
    public static int normalTechnique(int num){
        int result=1;
        if(num==0)
            return result;
        else{
            for(int i=2;i<=num;i++)
                result=result*i;
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number to find Factorial: ");
        int num=sc.nextInt();
        System.out.println("Using Recursion: ");
        System.out.println(usingRecursion(num));
        System.out.println("Using Normal Technique: ");
        System.out.println(normalTechnique(num));
        sc.close();
    }
}
