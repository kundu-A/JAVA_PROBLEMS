import java.util.Scanner;

public class RemovewhiteSpaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String str=sc.nextLine();
        System.out.println("After removing space: "+removingSpace(str));
        sc.close();
    }
    public static String removingSpace(String str){
        String result="";
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ')
                result=result+str.charAt(i);
            else
                c++;
        }
        System.out.println("Total no. of space removed: "+c);
        return result;
    }
}
