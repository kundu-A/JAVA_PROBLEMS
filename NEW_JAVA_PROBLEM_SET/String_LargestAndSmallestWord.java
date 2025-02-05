import java.util.*;
public class String_LargestAndSmallestWord {
    public static String largestWord(String str){
        String ar[]=str.split(" ");
        int temp=0,index=-1;
        for(int i=0;i<ar.length;i++){
            if(ar[i].length()>temp){
                temp=ar[i].length();
                index=i;
            }
        }
        return ar[index];
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
        System.out.println("Please enter a string: ");
        String str=sc.nextLine();
        System.out.println("The largest word is: "+largestWord(str));
        System.out.println("The smallest word is: "+smallestWord(str));
        sc.close();
    }
}
