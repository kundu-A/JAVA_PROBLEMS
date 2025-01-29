import java.util.*;
public class Interview_CountWords {
    public static int countWords(String str){
        str.trim();
        String temp[]=str.split(" ");
        return temp.length;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str=sc.nextLine();
        int c=countWords(str);
        System.out.println("Number of words: "+c);
        sc.close();
    }
}
