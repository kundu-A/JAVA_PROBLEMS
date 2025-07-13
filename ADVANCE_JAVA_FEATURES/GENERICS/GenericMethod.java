//Here we are going to implement Generic in Methods

import java.util.Scanner;

public class GenericMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GenericMethod genericMethod=new GenericMethod();

        Integer[] ar=new Integer[5];
        System.out.println("Please enter 5 integer values in array: ");
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
        genericMethod.printArray(ar);

        String[] ar2=new String[2];
        System.out.println("Please enter two string value in array: ");
        for(int i=0;i<ar2.length;i++)
            ar2[i]=sc.next();
        genericMethod.printArray(ar2);

        display(12);
        display("Hello");

        sc.close();
    }

    public <T> void printArray(T[] array){
        System.out.println("Your provide elements are: ");
        for (T element : array) {
            System.out.println(element);
        }
        System.out.println();
    }

    //When we call the other type value , this method will excute.
    public static <T> void display(T elemment){
        System.out.println("Your Generic type value is: "+elemment);
    }

    //When we call with Integer value this method will excute.
    public static void display(Integer value){
        System.out.println("Your Integer type value is: "+value);
    }
}
