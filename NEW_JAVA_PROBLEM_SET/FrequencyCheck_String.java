//TechMonastic Interview Questions
import java.util.*;
class Solution{
    public static int frequencyCheck(String input,char key){
        return (int)input.chars().filter(ch->ch==key).count();
    }
}
public class FrequencyCheck_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String input=sc.nextLine();
        System.out.println("Please enter the letter which you want to count: ");
        char key=sc.next().charAt(0);
        int result=Solution.frequencyCheck(input,key);
        if(result==0)
            System.out.println(key+" is not present in this String.");
        else
            System.out.println("Total no. of "+key+" is: "+result);
        sc.close();
    }
}
