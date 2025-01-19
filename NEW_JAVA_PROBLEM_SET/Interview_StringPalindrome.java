import java.util.*;
public class Interview_StringPalindrome {
    public static boolean usingRecursion(String s){
        if(s.length()<=1)
            return true;
        if(s.charAt(0)!=s.charAt(s.length()-1))
            return false;
        return usingRecursion(s.substring(1, s.length()-1));
    }
    public static boolean normalTechnique(String s){
        String result="";
        for(int i=s.length()-1;i>=0;i--)
            result=result+s.charAt(i);
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==result.charAt(i))
                continue;
            else{
                flag=1;
                break;
            }
        }
        if(flag==0)
            return true;
        else
            return false;
    }
    public static boolean shortTrick(String s){
        StringBuffer result=new StringBuffer(s);
        return s.equals(result.reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String s=sc.next();
        System.out.println("Using Recursion: ");
        System.out.println(usingRecursion(s));
        System.out.println("Using Normal Technique: ");
        System.out.println(normalTechnique(s));
        System.out.println("Using ShortTrick: ");
        System.out.println(shortTrick(s));
        sc.close();
    }
}
