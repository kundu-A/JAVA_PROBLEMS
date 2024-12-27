/*
Input: 000012356090
Output: 12356090
 */
import java.util.*;
public class RemoveLeadingZeros_String {
    public static String removeZeros(String input){
        String result="";
        int store=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='0')
                continue;
            else{
                store=i;
                break;
            }
        }
        for(int i=store;i<input.length();i++)
            result=result+input.charAt(i);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a numbers: ");
        String input=sc.next();
        System.out.println(removeZeros(input));
        sc.close();
    }
}
