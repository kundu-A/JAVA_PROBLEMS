import java.util.*;
public class ExceptionHandlingExample3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        try {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Please enter non zero number.");
            e.printStackTrace();
        }
        catch(InputMismatchException e){
            System.out.println("Please enter valid number.");
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("Something went wrong..");
            e.printStackTrace();
        }
        finally{
            sc.close();
            System.out.println("In finally block.");
        }
    }
}
