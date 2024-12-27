import java.util.*;
class Solution{
    public static boolean isPangram(String input){
        input=input.toLowerCase();
        String support="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<support.length();i++){
            if(input.indexOf(support.charAt(i))==-1)
                return false;
        }
        return true;
    }
}
public class StringPangram_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String input=sc.nextLine();
        boolean result=Solution.isPangram(input);
        if(result==true)
            System.out.println("This is Anagram!!");
        else
            System.out.println("This is not Anagram!!");
        sc.close();
    }
}
