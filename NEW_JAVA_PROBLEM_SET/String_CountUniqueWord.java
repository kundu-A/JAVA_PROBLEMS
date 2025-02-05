import java.util.*;
public class String_CountUniqueWord {
    public static int countUniqueWord(String str){
        int c=0;
        String ar[]=str.split(" ");
        for(int i=0;i<ar.length;i++){
            if(str.indexOf(ar[i])==str.lastIndexOf(ar[i])){
                System.out.print(ar[i]+" ");
                c++;
            }
        }  
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str=sc.nextLine();
        System.out.println("\nTotal number of unique words: "+countUniqueWord(str));
        sc.close();
    }
}
