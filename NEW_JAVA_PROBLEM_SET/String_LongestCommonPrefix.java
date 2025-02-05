import java.util.*;
public class String_LongestCommonPrefix {
    public static String longestPrefix(String[] ar){
        String str="";
        for(int i=0;i<ar.length;i++)
            str=str+ar[i]+" ";
        String temp=smallestWord(str.trim());
        String result="";
        for(int i=0;i<temp.length();i++){
            int flag=0;
            for(int j=0;j<ar.length;j++){
                if(ar[j].charAt(i)!=temp.charAt(i)){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                result=result+temp.charAt(i);
            else
                break;
        }
        return result;
    }
    public static String smallestWord(String str){
        String ar[]=str.split(" ");
        int temp=ar[0].length(),index=0;
        for(int i=1;i<ar.length;i++){
            if(ar[i].length()<temp){
                temp=ar[i].length();
                index=i;
            }
        }
        return ar[index];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        String ar[]=new String[size];
        System.out.println("Please enter words: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.next();
        System.out.println(longestPrefix(ar));
        sc.close();
    }
}
