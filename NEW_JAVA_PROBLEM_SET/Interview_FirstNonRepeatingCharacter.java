import java.util.*;
public class Interview_FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.println(str.charAt(i));
                break;
            }
        }
        sc.close();
    }
}
