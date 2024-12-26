import java.util.*;
class Solutions{
    public static void splitOperation(String input){
        for(int i=0;i<input.length();i++){
            String temp=""+input.charAt(i);
            System.out.println(temp);
            for(int j=i+1;j<input.length();j++){
                temp=temp+input.charAt(j);
                System.out.println(temp);
            }
        }
        System.out.println("\"\"");
    }
}
public class SplitStringIntoSubString_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a Stirng: ");
        String input=sc.nextLine();
        Solutions.splitOperation(input);
        sc.close();
    }
}
