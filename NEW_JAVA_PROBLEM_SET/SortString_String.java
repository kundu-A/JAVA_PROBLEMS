import java.util.*;
public class SortString_String {
    public String sort(String input){
        char[] store=input.toCharArray();
        Arrays.sort(store);
        return String.valueOf(store);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String input=sc.nextLine();
        SortString_String obj=new SortString_String();
        String result=obj.sort(input);
        System.out.println("Your sorted string in below:\n"+result);
        sc.close();
    }
}
