import java.util.*;
class Solution{
    public String reverse(String input){
        String result="";
        for(int i=input.length()-1;i>=0;i--)
            result=result+input.charAt(i);
        return result;
    }
    public String reverseString(String input){
        StringBuffer str=new StringBuffer(input);
        return str.reverse().toString();
    }
}
public class ReverseString_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input=sc.nextLine();
        Solution sol=new Solution();
        System.out.println("Without using in-bulit method: \n"+sol.reverse(input));
        System.out.println("With using in-bulit method: \n"+sol.reverseString(input));
        sc.close();
    }
}
