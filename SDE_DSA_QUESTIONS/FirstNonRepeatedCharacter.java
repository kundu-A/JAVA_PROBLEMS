import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str=sc.nextLine();
        System.out.println("First Non-Repeated Character: "
                            +findFirstNonRepeatedCharacter(str));
        sc.close();
    }
    public static char findFirstNonRepeatedCharacter(String str){
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(str.indexOf(c)==str.lastIndexOf(c))
                return c;
        }
        return (char)-1;
    }
}
