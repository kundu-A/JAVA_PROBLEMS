import java.util.Scanner;

public class PracticeNumberPatternProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size: ");
        int n=sc.nextInt();

        System.out.println("Pattern 1: ");
        NumberPattern.pattern1(n);
        System.out.println("**********************************************************");
        
        System.out.println("Pattern 2: ");
        NumberPattern.pattern2(n);
        System.out.println("**********************************************************");
        
        System.out.println("Pattern 3: ");
        NumberPattern.pattern3(n);
        System.out.println("**********************************************************");
        
        System.out.println("Pattern 4: ");
        NumberPattern.pattern4(n);
        System.out.println("**********************************************************");
        
        System.out.println("Pattern 5: ");
        NumberPattern.pattern5(n);
        System.out.println("**********************************************************");
        
        System.out.println("Pattern 6: ");
        NumberPattern.pattern6(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 7: ");
        NumberPattern.pattern7(n);
        System.out.println("**********************************************************");
        
        System.out.println("Pattern 8: ");
        NumberPattern.pattern8(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 9: ");
        NumberPattern.pattern9(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 10: ");
        NumberPattern.pattern10(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 11: ");
        NumberPattern.pattern11(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 12: ");
        NumberPattern.pattern12(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 13: ");
        NumberPattern.pattern13(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 14: ");
        NumberPattern.pattern14(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 15: ");
        NumberPattern.pattern15(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 16: ");
        NumberPattern.pattern16(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 17: ");
        NumberPattern.pattern17(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 18: ");
        NumberPattern.pattern18(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 19: ");
        NumberPattern.pattern19(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 20: ");
        NumberPattern.pattern20(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 21: ");
        NumberPattern.pattern21(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 22: ");
        NumberPattern.pattern22(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 23: ");
        NumberPattern.pattern23(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 24: ");
        NumberPattern.pattern24(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 25: ");
        NumberPattern.pattern25(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 26: ");
        NumberPattern.pattern26(n);
        System.out.println("**********************************************************");

        System.out.println("Pattern 27: ");
        NumberPattern.pattern27(n);
        System.out.println("**********************************************************");

        sc.close();
    }
}
class NumberPattern{
    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(i+" ");
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print(i+" ");
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--)
                System.out.print(j+" ");
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for(int i=n;i>=1;i--){
            for(int j=n;j>=n-i+1;j--)
                System.out.print(j+" ");
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--)
                System.out.print(j+" ");
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--)
                System.out.print(j+" ");
            System.out.println();
        }
    }
    public static void pattern9(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
    public static void pattern10(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
    public static void pattern11(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            for(int k=i-1;k>=1;k--)
                System.out.print(k+" ");
            System.out.println();
        }
    }
    public static void pattern12(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int k=1;k<=i;k++)
                System.out.print(k+" ");
            System.out.println();
        }
    }
    public static void pattern13(int n){
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=1;j--)
                System.out.print("  ");
            for(int k=1;k<=n-i+1;k++)
                System.out.print(k+" ");
            System.out.println();
        }
    }
    public static void pattern14(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int k=i;k>=1;k--)
                System.out.print(k+" ");
            System.out.println();
        }
    }
    public static void pattern15(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j<n;j++)
                System.out.print("  ");
            for(int k=i;k>=1;k--)
                System.out.print(k+" ");
            System.out.println();
        }
    }
    public static void pattern16(int n){
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=1;j--)
                System.out.print("  ");
            for(int k=i;k<=n;k++)
                System.out.print(k+" ");
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=i-1;j>=1;j--)
                System.out.print("  ");
            for(int k=i;k<=n;k++)
                System.out.print(k+" ");
            System.out.println();
        }
    }
    public static void pattern17(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print(k+" ");
            System.out.println();
        }
    }
    public static void pattern18(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--)
                System.out.print(" ");
            for(int j=i;j<=i*2-1;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
    public static void pattern19(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print(i+" ");
            System.out.println();
        }
    }
    public static void pattern20(int n){
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print(i+" ");
            System.out.println();
        }
    }
    public static void pattern21(int n){
        for(int i=n;i>=1;i--){
            for(int j=i-1;j>=1;j--)
                System.out.print(" ");
            for(int k=i;k<=n;k++)
                System.out.print(k+" ");
            System.out.println();
        }
    }
    public static void pattern22(int n){
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=1;j--)
                System.out.print(" ");
            for(int k=i;k<=n;k++)
                System.out.print(k+" ");
            System.out.println();
        }
    }
    public static void pattern23(int n){
        for(int i=n;i>=1;i--){
            for(int j=i-1;j>=1;j--)
                System.out.print(" ");
            for(int k=n;k>=i;k--)
                System.out.print(k+" ");
            System.out.println();
        }
    }
    public static void pattern24(int n){
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--)
                System.out.print(" ");
            for(int k=n;k>=n-i+1;k--)
                System.out.print(k+" ");
            System.out.println();
        }
    }
    public static void pattern25(int n){
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=1;j--)
                System.out.print(" ");
            for(int k=i;k<=n;k++)
                System.out.print(k+" ");
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=i-1;j>=1;j--)
                System.out.print(" ");
            for(int k=i;k<=n;k++)
                System.out.print(k+" ");
            System.out.println();
        }
    }
    public static void pattern26(int n){
        for(int i=n;i>=1;i--){
            int num=n-1,k=n-i+1,temp=0;
            for(int j=k;j>=1;j--){
                k=k+temp;
                System.out.print(k+" ");
                temp=num--;
            }
            System.out.println();
        }
    //     for (int i = 1; i <= n; i++) {
    //     int num = i;
    //     int diff = n - 1;

    //     for (int j = 1; j <= i; j++) {
    //         System.out.print(num + " ");
    //         num += diff--;
    //     }
    //     System.out.println();
    // }
    }
    public static void pattern27(int n){
        int c=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                int c1=c+i-1;
                for(int j=1;j<=i;j++)
                    System.out.print(c1-- +" ");
                c=c+i;
            }
            else{
                for(int j=1;j<=i;j++)
                    System.out.print(c++ +" ");
            }
            System.out.println();
        }
    }
}