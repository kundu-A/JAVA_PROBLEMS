import java.util.*;
public class Interview_StringContainsString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str=sc.nextLine();
        System.out.println("Please enter a Sub-String to check it;s presence: ");
        String subStr=sc.nextLine();
        if(str.contains(subStr))
            System.out.println("This sub-string is present in the string.");
        else
            System.out.println("This sub-string is not present in the string.");
        sc.close();
    }
}
