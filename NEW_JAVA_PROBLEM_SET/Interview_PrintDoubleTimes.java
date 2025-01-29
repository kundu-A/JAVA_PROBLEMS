import java.util.*;
public class Interview_PrintDoubleTimes {
    public static void printDoubleTimes(String words){
        for(int i=0;i<words.length();i++)
            System.out.print(words.charAt(i)+""+words.charAt(i));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word=sc.next();
        printDoubleTimes(word);
        sc.close();
    }
}
