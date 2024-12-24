/*
Anagram: L I S T E N == S I L E N T ,because
         1 1 1 1 1 1    1 1 1 1 1 1 , all the alphabates are present equally in both the word.

    L L A == L L A A , it not because L is present equal times in both word but not A.
 */
import java.util.*;
public class CheckAnagram_String {
    public static void isAnagram(String str1,String str2){
        for(int i=0;i<str1.length();i++){
            char w1=str1.charAt(i);
            char w2=str2.charAt(str2.indexOf(w1));
            if(str1.chars().filter(ch->ch==w1).count()!=str2.chars().filter(ch->ch==w2).count()){
                System.out.println("Those are not Anagram!!");
                return;
            }   
        }
        System.out.println("Those are Anagram!!");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 1st word: ");
        String input1=sc.next();
        System.out.println("Please enter 2nd word: ");
        String input2=sc.next();
        isAnagram(input1, input2);
        sc.close();
    }
}
