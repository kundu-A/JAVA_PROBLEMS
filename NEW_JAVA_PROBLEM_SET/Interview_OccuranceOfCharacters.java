import java.util.*;
public class Interview_OccuranceOfCharacters {
    public static void occurance(String str){
        String temp="";
        for(int i=0;i<str.length();i++){
            if(temp.indexOf(str.charAt(i))==-1)
                temp=temp+str.charAt(i);
        }
        for(int i=0;i<temp.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(temp.charAt(i)==str.charAt(j))
                    count++;
            }
            System.out.println(temp.charAt(i)+" : "+count);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str=sc.nextLine();
        occurance(str);
        sc.close();
    }
}
