import java.util.Scanner;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String str=sc.nextLine();
        System.out.println("Reversed words in sentence: "+reverseWords(str));
        System.out.println("Reversed words in sentence: "+wordReversal(str));
        sc.close();
    }
    public static String reverseWords(String str){
        str.trim();
        String[] words=str.split(" ");
        String result="";
        for(int i=words.length-1 ;i>=0;i--)
            result=result+words[i]+" ";
        return result.trim();
    }
    public static String wordReversal(String str){
        str.trim();
        str=" "+str;
        String result="";
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' ')
                sb.append(str.charAt(i));
            else{
                result=result+sb.reverse().toString()+" ";
                sb=new StringBuilder();
            }
        }
        return result.trim();
    }
}
