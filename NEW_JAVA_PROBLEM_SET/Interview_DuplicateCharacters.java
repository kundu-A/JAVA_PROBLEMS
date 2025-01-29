import java.util.*;
public class Interview_DuplicateCharacters {
    public static void findDuplicateCharacters(String str){
        str=str+" ";
        String result="";
        for(int i=0;i<str.length()-1;i++){
            String temp=str.substring(i+1, str.length()-1);
            if(temp.indexOf(str.charAt(i))!=-1){
                if(result.indexOf(str.charAt(i))==-1)
                    result=result+str.charAt(i)+" ";
            }
        }
        System.out.println("Duplicates are: \n"+result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str=sc.nextLine();
        findDuplicateCharacters(str);
        sc.close();
    }
}
