import java.util.*;
public class ExceptionHandlingExample2 extends Exception{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range=sc.nextInt();
        int ar[]=new int[range];
        System.out.println("Enter values in array: ");
        for(int i=0;i<ar.length;i++){
            try {
                ar[i]=sc.nextInt();
                if(ar[i]<=0)
                    throw new ExceptionHandlingExample2();
            } catch (Exception e) {
                System.out.println("Please enter non zero value.....");
                i=i-1;
            }
        }
        System.out.println("Enter any position to print in between "+(range-1));
        try {
            int pos=sc.nextInt();
            System.out.println(ar[pos]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
    }
}
