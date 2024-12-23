import java.util.*;
public class InsertString_String {
    public static String insertString(String input,int index,String insertString){
        if(index <=0 || index>input.length())
            return "Please enter a valid index";
        return input.substring(0,index+1)+insertString+input.substring(index+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String input=sc.nextLine();
        System.out.println("Please enter the index where you want to insert: ");
        int index=sc.nextInt();
        System.out.println("Please enter a String to to inserted: ");
        String insertString=sc.next();
        System.out.println(insertString(input, index, insertString));
        sc.close();
    }
}
