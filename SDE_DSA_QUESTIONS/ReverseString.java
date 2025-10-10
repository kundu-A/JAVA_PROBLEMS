import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str=sc.nextLine();
        String result=reverseString(str);
        System.out.println("Reversed Version: "+result);
        sc.close();
    }
    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
}