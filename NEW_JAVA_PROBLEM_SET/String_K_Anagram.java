import java.util.*;
public class String_K_Anagram {
    public static void isAnagram(String str1,String str2,int k){
        TreeMap<Character,Integer> str1_frequency=new TreeMap<>();
        TreeMap<Character,Integer> str2_frequency=new TreeMap<>();
        for(int i=0;i<str1.length();i++){
            char temp=str1.charAt(i);
            int count=(int)str1.chars().filter(ch->ch==temp).count();
            str1_frequency.put(str1.charAt(i),count);
        }
        for(int i=0;i<str2.length();i++){
            char temp=str2.charAt(i);
            int count=(int)str2.chars().filter(ch->ch==temp).count();
            str2_frequency.put(str2.charAt(i),count);
        }
        System.out.println(str1_frequency);
        System.out.println(str2_frequency);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter two string: ");
        String str1=sc.next();
        String str2=sc.next();
        System.out.println("Please enter the value of k: ");
        int k=sc.nextInt();
        isAnagram(str1, str2 ,k);
        sc.close();
    }
}
