import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a word to check is it palindrome or not: ");
        String str=sc.next();
        System.out.println(str+" is palindrome: "+isPalindrome(str));
        System.out.println(str+" is palindrome: "+isPalindromeOrNot(str));
        sc.close(); 
    }
    public static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        return str.equalsIgnoreCase(sb.reverse().toString());
    }
    public static boolean isPalindromeOrNot(String str){
        int flag=0;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                flag=1;
                break;
            }
        }
        if(flag==0)
            return true;
        return false;
    }
}
