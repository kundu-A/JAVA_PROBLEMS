import java.util.Scanner;

public class Interview_PrintingProblem_2 {
    public static void solution(String input){
        String lowercase="";
        String uppercase="";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>=65 && input.charAt(i)<=90)
                uppercase=uppercase+input.charAt(i);
            if(input.charAt(i)>=97 && input.charAt(i)<=122)
                lowercase=lowercase+input.charAt(i);
        }
        System.out.println(uppercase);
        System.out.println(lowercase);
    }
    public static void main(String[] args) {
        System.out.println("Input : aBACbcEDed");
        System.out.println("Lowercase : abcde and Uppercase : ABCDE");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter input: ");
        String input=sc.next();
        solution(input);
        sc.close();
    }
}
