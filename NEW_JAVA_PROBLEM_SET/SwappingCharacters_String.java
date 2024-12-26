/*
input = arpan
output = r+a+a+p+n = raapn
 */
import java.util.*;
public class SwappingCharacters_String {

    //This is an possible approach
    public static void swappingCharacters(String input){
        String result="";
        for(int i=0;i<input.length()-1;i++){
            if(i%2==0)
                result=result+input.charAt(i+1);
            if(i%2!=0)
                result=result+input.charAt(i-1);
        }
        if(input.length()%2!=0)
            result=result+input.charAt(input.length()-1);
        if(input.length()%2==0)
            result=result+input.charAt(input.length()-2);
        System.out.println(result);
    }

    //This is also an possible approach - Most preferrable.
    public static String swapping(String input){
        StringBuffer result=new StringBuffer(input.length());
        for(int i=0;i<input.length()-1;i+=2){
            result.append(input.charAt(i+1));
            result.append(input.charAt(i));
        }
        if(input.length()%2!=0)
            result.append(input.charAt(input.length()-1));
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String input=sc.next();
        System.out.println(swapping(input));
        swappingCharacters(input);
        sc.close();
    }
}
