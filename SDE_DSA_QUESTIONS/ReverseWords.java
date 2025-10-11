import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a sentance: ");
        String str=sc.nextLine();
        String result=reverse(str);
        System.out.println("Reversed version: "+result);
        System.out.println("Reversed version: "+stringReversal(str));
        sc.close();
    }
    public static String reverse(String str){
        str=str.trim();
        String[] words=str.split(" ");
        String result="";
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder(words[i]);
            result=result+sb.reverse().toString()+" ";
        }
        return result;
    }
    public static String stringReversal(String str){
        str=str.trim();
        str=str+" ";
        String result="";
        int firstIndex=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                int lastIndex=i-1;
                for(int j=lastIndex;j>=firstIndex;j--)
                    result=result+str.charAt(j);
                firstIndex=lastIndex+2;
                result=result+" ";
            }
        }
        return result.trim();
    }
}
