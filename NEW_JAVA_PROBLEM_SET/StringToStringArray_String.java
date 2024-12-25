import java.util.*;
public class StringToStringArray_String {
    public static String[] makeArray(String input){
        String result[]=input.split(" ");
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input=sc.nextLine();
        String result[]=makeArray(input);
        System.out.println("After dividing each word into the array element: ");
        for (String s : result) {
            System.out.println(s);
        }
        sc.close();
    }
}
