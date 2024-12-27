import java.util.*;
class Solution{
    public static void reverseString(String input){
        if(input.length()<=0){
            System.out.println("Please enter a valid string!!");
            return;
        }
        String result="";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<input.length();i++)
            stack.push(input.charAt(i));
        for(int i=0;i<input.length();i++)
            result=result+stack.pop();
        System.out.println("Your reversed string is: \n"+result);
    }
}
public class ReverseStringUsingStack_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String input=sc.nextLine();
        Solution.reverseString(input);
        sc.close();
    }
}
