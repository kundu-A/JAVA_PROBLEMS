//TechMonastic Interview Questions
import java.util.*;
class Solution{
    public static String makeCapital(String input){
        input=input.trim();
        StringBuffer str=new StringBuffer(input);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                if(str.charAt(i+1)!=' ' && (str.charAt(i+1)>=97 && str.charAt(i+1)<=123))
                    str.setCharAt((i+1), (char)(str.charAt(i+1)-32));
            }
        }
        return str.toString();
    }
}
public class CapitalAfterSpace_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String input=sc.nextLine();
        System.out.println(Solution.makeCapital(input));
        sc.close();
    }
}
