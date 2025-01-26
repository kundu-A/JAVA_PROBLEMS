import java.util.*;
public class Interview_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a decimal number: ");
        int num=sc.nextInt();
        String binary=Integer.toBinaryString(num);
        System.out.println(binary);
        sc.close();
    }
}
