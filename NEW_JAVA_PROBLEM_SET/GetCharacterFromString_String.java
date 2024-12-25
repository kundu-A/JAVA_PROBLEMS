import java.util.*;
public class GetCharacterFromString_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input=sc.nextLine();
        System.out.println("Please enter the index from where you want to get character: ");
        int index=sc.nextInt();
        for(int i=0;i<input.length();i++){
            if(i==(index-1))
                System.out.println("At "+index+" "+input.charAt(i)+" is present.");
        }
        sc.close();
    }
}