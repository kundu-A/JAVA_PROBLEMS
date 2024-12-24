import java.util.*;
public class StringPalindrome_String {
    public static boolean isPalindrome(String input){
        StringBuffer s=new StringBuffer(input);
        s=s.reverse();
        for(int i=0;i<s.length();i++){
            if(input.charAt(i)!=s.charAt(i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word to check Palindrome or not: ");
        String input=sc.next();
        if(isPalindrome(input)==true)
            System.out.println("This is Palindrome");
        else   
            System.out.println("This is not Palindrome");
        sc.close();
    }
}
