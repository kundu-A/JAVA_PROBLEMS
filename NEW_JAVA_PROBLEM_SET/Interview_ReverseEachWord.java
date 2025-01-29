import java.util.*;
public class Interview_ReverseEachWord {
    public static String reverseWord(String str){
        String ar[]=str.split(" ");
        String result="";
        for (String word : ar) {
            StringBuffer sb=new StringBuffer(word);
            result=result+sb.reverse().toString()+" ";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str=sc.nextLine();
        System.out.println(reverseWord(str));
        sc.close();
    }
}
