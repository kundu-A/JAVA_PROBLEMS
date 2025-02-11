/*
    1.First convert the given string to “a11” i.e. write, character along with its frequency.

    2.Then, change “a11” to “ab” because 11 is b in hexadecimal.

    3.Then, finally reverse the string i.e “ba”.
 */
import java.util.*;
public class String_EncryptString {
    public static String encrypt(String str){
        String temp="";
        for(int i=0;i<str.length();i++){
            if(temp.indexOf(str.charAt(i))==-1)
                temp=temp+str.charAt(i);
        }
        String combine="";
        for(int i=0;i<temp.length();i++){
            char c=temp.charAt(i);
            int count=(int)str.chars().filter(ch->ch==c).count();
            combine=combine+temp.charAt(i)+Integer.toHexString(count);
        }
        StringBuffer sb=new StringBuffer(combine);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(":Please enter a string: ");
        String str=sc.next();
        System.out.println("Your Encrypted String is: "+encrypt(str));
        sc.close();
    }
}
