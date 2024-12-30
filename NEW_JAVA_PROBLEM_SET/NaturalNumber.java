import java.util.*;
class Solution{
    public static void naturalNumbers(int range){
        for(int i=1;i<=range;i++)
            System.out.print(i+" ");
        System.out.println("The Sum of "+range+" natural numbers is: "+((range*(range+1))/2));
    }
}
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter range to find Natural Number: ");
        int range=sc.nextInt();
        Solution.naturalNumbers(range);
        sc.close();
    }
}
