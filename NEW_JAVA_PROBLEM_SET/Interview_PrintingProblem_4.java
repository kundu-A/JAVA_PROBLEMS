import java.util.*;
public class Interview_PrintingProblem_4 {
    public static void solution(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0')
                result=result+str.charAt(i);
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0')
                result=result+str.charAt(i);
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        System.out.println("Input : 32400121200");
        System.out.println("Output : 00003241212");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter String: ");
        String str=sc.next();
        solution(str);
        sc.close();
    }
}
