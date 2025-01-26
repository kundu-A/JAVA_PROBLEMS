import java.util.*;
public class Interview_StringLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str=sc.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++)
            c++;
        System.out.println("Length of the String is: "+c);
        sc.close();
    }
}
