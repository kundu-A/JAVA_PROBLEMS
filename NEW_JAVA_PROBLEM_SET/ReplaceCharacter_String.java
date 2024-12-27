/*
Input: String = "Geeks Gor Geeks", index = 6, ch = 'F'
Output: "Geeks For Geeks."
 */
import java.util.*;
class Solution{
    public static String replace(String input,char key,int index){
        if(index>input.length())
            return "You index is out of bound!!";
        StringBuffer result=new StringBuffer(input.length());
        for(int i=0;i<input.length();i++){
            if(i==index)
                result.append(key);
            else
                result.append(input.charAt(i));
        }
        return result.toString();
    }
}
public class ReplaceCharacter_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String input=sc.nextLine();
        System.out.println("Please enter the character by which you want to replace: ");
        char key=sc.next().charAt(0);
        System.out.println("Please enter the index where you want to change: ");
        int index=sc.nextInt();
        System.out.println(Solution.replace(input,key,index-1));
        sc.close();
    }
}
