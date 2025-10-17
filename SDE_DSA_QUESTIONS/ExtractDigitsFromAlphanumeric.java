import java.util.Scanner;

public class ExtractDigitsFromAlphanumeric {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter alpha-numeric value: ");
        String input=sc.next();
        System.out.println("After extraction: "+digitExtraction(input));
        sc.close();
    }
    public static String digitExtraction(String input){
        String output="";
        for (char c:input.toCharArray()) {
            if(Character.isDigit(c))
                output=output+c;
        }
        return output;
    }
}
