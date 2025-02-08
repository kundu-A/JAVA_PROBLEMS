import java.util.*;
public class Interview_PrintingProblem_3 {
    public static void solution(String str){
        String word="";
        String number="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
                word=word+str.charAt(i);
            else
                number=number+str.charAt(i);
        }
        System.out.println("Characters are: "+word);
        System.out.println("Numbers are: "+number);
    }
    public static void main(String[] args) {
        System.out.println("Input : Subbu123raj");
        System.out.println("Output-1 : Subburaj\nOutput-2 : 123");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str=sc.next();
        solution(str);
        sc.close();
    }
}
