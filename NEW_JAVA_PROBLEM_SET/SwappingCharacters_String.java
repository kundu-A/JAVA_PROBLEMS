/*
input = arpan
output = r+a+a+p+n = raapn
 */
import java.util.*;
public class SwappingCharacters_String {
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
        sc.close();
    }
}
