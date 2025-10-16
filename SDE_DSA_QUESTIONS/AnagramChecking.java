import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter two strings: ");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println("Are those Strings are Anagram: "+isAnagram(str1, str2));
        sc.close();
    }
    public static boolean isAnagram(String s1,String s2){
        s1=s1.trim();
        s2=s2.trim();
        if(s1.length() != s2.length())
            return false;
        return Arrays.equals(
            s1.toLowerCase().chars().sorted().toArray(),
            s2.toLowerCase().chars().sorted().toArray());
    }   
}
