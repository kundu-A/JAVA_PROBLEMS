import java.util.*;
public class Interview_MaximumOccuranceCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str=sc.next();
        int count=0;
        char ch=str.charAt(0);
        for(int i=0;i<str.length();i++){
            int temp=0;
            char tempChar=str.charAt(i);
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))
                    temp++;
            }
            if(temp>count){
                count=temp;
                ch=tempChar;
            }
        }
        System.out.println("Maximun occured character is: "+ch+" ,which repeated "+count+" time.");
        sc.close();
    }
}
