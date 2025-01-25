import java.util.*;
public class Interview_StringAnagram {
    public static boolean isAnagram(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        for(int i=0;i<str1.length();i++){
            if(str2.indexOf(str1.charAt(i))==-1)
                return false;
        }   
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter two String to check both ara anagram or not: ");
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(isAnagram(str1, str2));
        sc.close();
    }
}
