import java.util.*;
class Solution{
    public static String extractLetter(String input){
        String result="";
        result=result+input.charAt(0);
        input=input.trim();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                if(input.charAt(i+1)!=' ')
                    result=result+input.charAt(i+1);
            }
        }
        return result;
    }
}
public class PrintFirstLetterOfEachWord_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String input=sc.nextLine();
        System.out.println(Solution.extractLetter(input));
        sc.close();
    }
}
