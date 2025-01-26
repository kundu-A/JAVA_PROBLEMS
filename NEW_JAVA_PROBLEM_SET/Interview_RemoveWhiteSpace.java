import java.util.*;
public class Interview_RemoveWhiteSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str=sc.nextLine();
        StringBuffer result=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ')
                result.append(str.charAt(i));
        }
        System.out.println(result);
        sc.close();
    }
}
