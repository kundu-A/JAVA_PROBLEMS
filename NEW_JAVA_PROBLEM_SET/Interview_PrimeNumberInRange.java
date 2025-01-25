import java.util.Scanner;

public class Interview_PrimeNumberInRange {
    public static void primeInRange(int start , int last){
        System.out.println("In between "+start+" and "+last+" total prime numbers are: ");
        for(int i=start;i<=last;i++){
            int input=i;
            int flag=0;
            for(int j=2;j<=input/2;j++){
                if(input%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0 && (i!=0 && i!=1))
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first point of range: ");
        int start=sc.nextInt();
        System.out.println("Please enter last point of range: ");
        int last=sc.nextInt();
        primeInRange(start, last);
        sc.close();
    }
}
