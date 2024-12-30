import java.util.*;
class Solution{
    public static List<Integer> armstrongInRange(int lowerRange , int upperRange){
        List<Integer> result=new LinkedList<Integer>();
        for(int i=lowerRange;i<=upperRange;i++){
            int input=i;
            int temp=input,digitCount=0;
            while (temp>0) {
                digitCount++;
                temp=temp/10;
            }
            int p=1,sum=0,store=input;
            while(input>0){
                p=(int)Math.pow(input%10, digitCount);
                sum=sum+p;
                input=input/10;
            }
            if(sum==store)
                result.add(i);
        }
        return result;
    }
}
public class ArmstrongNumberInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Please enter the lower range: ");
        int lowerRange=sc.nextInt();
        System.out.println("Please enter the upper range: ");
        int upperRange=sc.nextInt();
        List<Integer> result=Solution.armstrongInRange(lowerRange, upperRange);
        System.out.println(result);
        sc.close();
    }
}
