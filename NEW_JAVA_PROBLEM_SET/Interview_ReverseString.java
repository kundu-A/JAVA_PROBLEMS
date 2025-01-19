import java.util.*;
public class Interview_ReverseString {
    public static String usingRecursion(String s){
        String result="";
        if(s.length()==0)
            return result;
        else{
            return result=result+s.charAt(s.length()-1)+usingRecursion(s.substring(0, s.length()-1));
        }
    }
    public static String normalTechnique(String s){
        String result="";
        for(int i=s.length()-1;i>=0;i--)
            result=result+s.charAt(i);
        return result;
    }
    public static String shortTrick(String s){
        StringBuffer result=new StringBuffer(s);
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String s=sc.nextLine();
        System.out.println("Using Recursion: ");
        System.out.println(usingRecursion(s));
        System.out.println("Using Normal Technique: ");
        System.out.println(normalTechnique(s));
        System.out.println("Using Short cut: ");
        System.out.println(shortTrick(s));
        sc.close();
    }
}
