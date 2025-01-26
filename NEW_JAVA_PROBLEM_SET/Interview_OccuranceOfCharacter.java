import java.util.*;
public class Interview_OccuranceOfCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str=sc.nextLine();
        System.out.println("Please enter a number character: ");
        char ch=sc.next().charAt(0);
        if(str.indexOf(ch)!=-1)
            System.out.println("This character is present at: "+(str.indexOf(ch)+1));
        else
            System.out.println("This character is not present.");
        sc.close();
    }
}
