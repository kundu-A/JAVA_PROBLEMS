/*If a string have all the vowels in it , print "YES" and if not then print "NO". */
import java.util.*;
class Problem_1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A STRING: ");
        String s=sc.next();
        sc.close();
        s=s.toLowerCase();
        if(s.indexOf('a')!=-1 && s.indexOf('e')!=-1  && s.indexOf('i')!=-1  && s.indexOf('o')!=-1  && s.indexOf('u')!=-1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}