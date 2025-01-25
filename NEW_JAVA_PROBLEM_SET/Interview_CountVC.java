import java.util.*;
public class Interview_CountVC {
    public static void countVowelConsonent(String str){
        String vowel="aeiou";
        int vowelCount=0,consonentCount=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(vowel.indexOf(str.charAt(i))!=-1)
                vowelCount++;
            else{
                if(str.charAt(i)>=95 && str.charAt(i)<=122)
                    consonentCount++;
            }
        }
        System.out.println("Total number of Vowel is: "+vowelCount);
        System.out.println("Total number of Consonent is: "+consonentCount);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the String : ");
        String input=sc.nextLine();
        countVowelConsonent(input);
        sc.close();
    }
}
