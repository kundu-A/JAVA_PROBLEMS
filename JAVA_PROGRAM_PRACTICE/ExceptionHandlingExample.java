import java.util.*;
public class ExceptionHandlingExample extends Exception{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        ExceptionHandlingExample ob=new ExceptionHandlingExample();
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==0 || b==0)
                //throw new ExceptionHandlingExample();
                throw ob;
            System.out.println(a/b);
        } catch (ExceptionHandlingExample e) {
            System.out.println("Something went wrong..");
        }
    }
}
