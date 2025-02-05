import java.util.*;
import java.util.stream.Collectors;
public class String_RemoveAllAdjacent {
    public static String removeAllAdjacent(String str){
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++)
            set.add(str.charAt(i));
        
        String str1=set.stream().map(String::valueOf).collect(Collectors.joining());
        
        String result="";
        for(int i=0;i<str1.length();i++){
            char target=str1.charAt(i);
            long c=str.chars().filter(ch->ch == target).count();
            if(c==1 || c%2!=0)
                result=result+str1.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str=sc.next();
        System.out.println(removeAllAdjacent(str));
        sc.close();
    }
}
