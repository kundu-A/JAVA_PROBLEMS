import java.util.Scanner;
class Converter{
    static Scanner sc=new Scanner(System.in);
    /*---------------------- BINARY CONVERTER ------------------------ */
    public static void binaryToDecimal(){
        System.out.println("PERFORMING BINARY TO DECIMAL!!!");
        System.out.println("Please enter a binary numbers: ");
        String input=sc.nextLine();
        int num=Integer.parseInt(input,2);
        String decimal=Integer.toString(num);
        System.out.println(input+" = "+decimal);
    }
    public static void binaryToHexaDecimal(){
        System.out.println("PERFORMING BINARY TO HEXADECIMAL!!!");
        System.out.println("Please enter a binary numbers: ");
        String input=sc.nextLine();
        int num=Integer.parseInt(input,2);
        String hexa=Integer.toHexString(num);
        System.out.println(input+" = "+hexa);
    }
    public static void binaryToOctal(){
        System.out.println("PERFORMING BINARY TO OCTAL!!!");
        System.out.println("Please enter a binary number: ");
        String input=sc.nextLine();
        int num=Integer.parseInt(input,2);
        String octal=Integer.toOctalString(num);
        System.out.println(input+" = "+octal);
    }
     /*---------------------- OCTAL CONVERTER ------------------------ */
    public static void octalToBinary(){
        System.out.println("PERFORMING OCTAL TO BINARY!!!");
        System.out.println("Please enter a octal number: ");
        String input=sc.nextLine();
        int num=Integer.parseInt(input,8);
        String binary=Integer.toBinaryString(num);
        System.out.println(input+" ="+binary);
    }
    public static void octalToDecimal(){
        System.out.println("PERFORMING OCTAL TO DECIMAL!!!");
        System.out.println("Please enter a octal number: ");
        String input=sc.nextLine();
        int num=Integer.parseInt(input,8);
        String decimal=Integer.toString(num);
        System.out.println(input+" = "+decimal);
    }
    public static void octalToHexaDecimal(){
        System.out.println("PERFORMING OCTAL TO HEXADECIMAL!!!");
        System.out.println("Please enter octal number: ");
        String input=sc.nextLine();
        int num=Integer.parseInt(input,8);
        String hexa=Integer.toHexString(num);
        System.out.println(input+" = "+hexa);
    }
     /*---------------------- DECIMAL CONVERTER ------------------------ */
    public static void decimalToBinary(){
        System.out.println("PERFORMING DECIMAL TO BINARY!!!");
        System.out.println("Pleasee enter a decimal number: ");
        String input=sc.nextLine();
        int num=Integer.parseInt(input,10);
        String binary=Integer.toBinaryString(num);
        System.out.println(input+" = "+binary);
    }
    public static void decimalToOctal(){
        System.out.println("PERFORMING DECIMAL TO OCTAL!!!");
        System.out.println("Please enter a decimal number: ");
        String input=sc.nextLine();
        int num=Integer.parseInt(input,10);
        String octal=Integer.toOctalString(num);
        System.out.println(input+" = "+octal);
    }
    public static void decimalToHexaDecimal(){
        System.out.println("DECIMAL TO HEXADECIMAL!!!");
        System.out.println("Please enter a decimal number: ");
        String input=sc.nextLine();
        int num=Integer.parseInt(input,10);
        String hexa=Integer.toHexString(num);
        System.out.println(input+" = "+hexa);
    }
     /*---------------------- HEXADECIMAL CONVERTER ------------------------ */
    public static void hexaDecimalToBinary(){
        System.out.println("HEXADECIMAL TO BINARY!!!");
        System.out.println("Please enter Hexadecimal number: ");
        String input=sc.nextLine();
        int num=Integer.parseInt(input,12);
        String binary=Integer.toBinaryString(num);
        System.out.println(input+" = "+binary);
    }
    public static void hexaDecimalToDecimal(){
        System.out.println("HEXADECIMAL TO DECIMAL!!!");
        System.out.println("Please enter Hexadecimal number: ");
        String input=sc.nextLine();
        int num=Integer.parseInt(input,12);
        String binary=Integer.toString(num);
        System.out.println(input+" = "+binary);
    }
    public static void hexaDecimalToOctal(){
        System.out.println("HEXADECIMAL TO OCTAL!!!");
        System.out.println("Please enter Hexadecimal number: ");
        String input=sc.nextLine();
        int num=Integer.parseInt(input,12);
        String binary=Integer.toOctalString(num);
        System.out.println(input+" = "+binary);
    }
    /*---------------------- FAHRENHEIT TO CELSIUS ------------------------ */ 
    public static void fahrenheitToCelsius(){
        System.out.println("Please enter degree's in fahrenheit: ");
        double f=sc.nextDouble();
        double c=((f-32)*5)/9;
        System.out.println("In Fahrenheit "+f+" = "+c+" in Celsius.");
    }
}
public class NumberConverter {
    public static void main(String[] args) {
        /*---------------------- BINARY CONVERTER ------------------------ */
        Converter.binaryToDecimal();
        Converter.binaryToHexaDecimal();
        Converter.binaryToOctal();
        /*---------------------- OCTAL CONVERTER ------------------------ */
        Converter.octalToBinary();
        Converter.octalToDecimal();
        Converter.octalToHexaDecimal();
        /*---------------------- DECIMAL CONVERTER ------------------------ */
        Converter.decimalToBinary();
        Converter.decimalToHexaDecimal();
        Converter.decimalToOctal();
        /*---------------------- HEXADECIMAL CONVERTER ------------------------ */
        Converter.hexaDecimalToBinary();
        Converter.hexaDecimalToDecimal();
        Converter.hexaDecimalToOctal();
        /*---------------------- FAHRENHEIT TO CELSIUS ------------------------ */
        Converter.fahrenheitToCelsius();
    }
}
