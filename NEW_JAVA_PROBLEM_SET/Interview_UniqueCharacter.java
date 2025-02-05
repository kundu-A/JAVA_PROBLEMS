import java.util.*;
public class Interview_UniqueCharacter {
    public static String uniqueCharacter(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            if(result.indexOf(str.charAt(i))==-1)
                result=result+str.charAt(i)+" ";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str=sc.nextLine();
        String result=uniqueCharacter(str);
        System.out.println("Unique Characters are: \n"+result);
        sc.close();
    }
}
