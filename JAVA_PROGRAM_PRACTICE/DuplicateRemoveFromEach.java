import java.util.*;
public class DuplicateRemoveFromEach
{
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ar[]=str.split(" ");
        String f="";
        for(String s:ar){
        String s1=""+s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            int flag=0;
            for(int j=0;j<s1.length();j++)
            {
                if(s.charAt(i)==s1.charAt(j))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                s1=s1+s.charAt(i);
        }
        f=f+s1+" ";
        s1="";
    }
        System.out.println(f.trim());
    }
}