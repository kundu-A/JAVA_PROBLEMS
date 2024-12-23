import java.util.*;
public class PrintEvenLengthWord_String {
    public static void printEvenLength(String input){
        String ar[]=input.split(" ");
        System.out.println("Even length words are: ");
        for (String word : ar) {
            if(word.length()%2==0)
                System.out.println(word);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input=sc.nextLine();
        printEvenLength(input);
        sc.close();
    }
}
