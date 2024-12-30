import java.util.*;
class Solution{
    public int reverse(int nums){
        int sum=0;
        while (nums>0) {
            int temp=nums%10;
            sum=sum*10+temp;
            nums=nums/10;
        }
        return sum;
    }
}
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number to make it reverse: ");
        int input=sc.nextInt();
        Solution solution=new Solution();
        int reverse=solution.reverse(input);
        if(input==reverse)
            System.out.println("Original = "+input+" and Reverse = "+reverse+" , so it Palindrome.");
        else
            System.out.println("Original = "+input+" and Reverse = "+reverse);
        sc.close();
    }
}
