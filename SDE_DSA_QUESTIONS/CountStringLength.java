import java.util.Scanner;

public class CountStringLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str=sc.nextLine();
        System.out.println("The string length: "+calculateLength(str));
        System.out.println("The string length: "+lengthCalculation(str));
        sc.close();
    }
    public static int calculateLength(String str){
        return (int)str.chars().count();
    }
    public static int lengthCalculation(String str){
        int len=0;
        try{
            while (true) {
                str.charAt(len);
                len++;
            }
        }catch(Exception e){
            System.out.println("Whole string is completed");
        }
        return len;
    }
}