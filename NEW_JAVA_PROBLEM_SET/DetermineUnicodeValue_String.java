import java.util.*;
public class DetermineUnicodeValue_String {
    public static void determineUnicode(String input){
        int store[]=new int[input.length()];
        for(int i=0;i<input.length();i++){
            store[i]=input.charAt(i);
        }
        for(int i=0;i<input.length();i++)
            System.out.println(input.charAt(i)+" = "+store[i]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word=sc.next();
        determineUnicode(word);
        sc.close();
    }
}
