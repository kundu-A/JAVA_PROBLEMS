import java.util.*;
public class Interview_PrintingProblem {
    public static void main(String[] args) {
        System.out.println("Intput: aabbccdd");
        System.out.println("Output: a2b2c2d2");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str=sc.next();
        List<Character> uniCharacters=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(uniCharacters.indexOf(str.charAt(i))==-1)
                uniCharacters.add(str.charAt(i));
        }
        String s="";
        for(int i=0;i<uniCharacters.size();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(uniCharacters.get(i)==str.charAt(j))
                    count++;
            }
            s=s+uniCharacters.get(i)+count;
        }
        System.out.println(s);
        sc.close();
    }
}
 