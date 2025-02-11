import java.util.*;
public class String_IsomorphicString {
    public static void isomorphic(String w1,String w2){
        String temp="";
        int flag=0;
        for(int i=0;i<w1.length();i++){
            if(temp.indexOf(w1.charAt(i))==-1)
                temp=temp+w1.charAt(i);
        }
        for(int i=0;i<temp.length();i++){
            int c1=0;
            for(int j=i;j<w1.length();j++){
                if(w1.charAt(i)!=w1.charAt(j))
                    break;
                else
                    c1++;
            }
            System.out.println(c1);
            int c2=0;
            for(int j=i;j<w2.length();j++){
                if(w2.charAt(i)!=w2.charAt(j))
                    break;
                else
                    c2++;
            }
            System.out.println(c2);
            if(c1!=c2){
                flag=1;
                System.out.println("Those are not isomorphic");
                break;
            }
        }
        if(flag==0)
            System.out.println("Isomorphic.");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a two words: ");
        String word1=sc.next();
        String word2=sc.next();
        isomorphic(word1, word2);
        sc.close();
    }
}
