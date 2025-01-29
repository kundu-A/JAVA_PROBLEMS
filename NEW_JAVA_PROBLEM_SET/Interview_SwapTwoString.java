import java.util.*;
public class Interview_SwapTwoString {
    public static void swapTwoString(String s1, String s2){
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println("After swapping : ");
        System.out.println(s1);
        System.out.println(s2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str1=sc.nextLine();
        System.out.println("Please enter another String: ");
        String str2=sc.nextLine();
        swapTwoString(str1, str2);
        sc.close();
    }
}
