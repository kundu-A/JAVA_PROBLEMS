import java.util.Scanner;

public class Interview_EvenIndexedCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(i%2==0)
                System.out.print(str.charAt(i)+" ");
        }
        sc.close();
    }
}
