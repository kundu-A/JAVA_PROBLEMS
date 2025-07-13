//Here we define an interface

import java.util.Scanner;

interface printable{
    void print();
}

//here in MyNumber class extends Number class and implement our created Printable interface.
class MyNumber extends Number implements printable{

    private int value=0;

    //Here we set the value of that variable using constructor at the time of object creation.
    public MyNumber(int value){
        this.value=value;
    }
    //Implement the method of Printable interface.
    @Override
    public void print() {
        System.out.println("Your age is: "+value);
    }

    //Implement methods of Number class.
    @Override
    public int intValue() {
        return value;
    }
    @Override
    public long longValue() {
        return value;
    }
    @Override
    public float floatValue() {
        return value;
    }
    @Override
    public double doubleValue() {
        return value;
    }
    
}

//Here we implement Bounded Type Parameter. In below we define a class and set a bound that means all the values must belongs to this Number and Printable types.
//Syntax - T extends Class & Interface & Interface & Interface &.....
//And we can't use the keyword "implements" , means we can directly implements any interface here.
class Boxx<T extends Number & printable> {

    //So here we have to pass MyNumber class's object , becuase here MyNumber class is extending the Number class and implements Printable interface.
    private T item=null;

    public void add(T item){
        this.item=item;
    }
    public void display(){
        item.print();
    }
    public T getItem(){
        return item;
    }
}

public class BoundTypeParameter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age=sc.nextInt();
        //Here we create the MyNumber class object with a value.
        MyNumber myNumber=new MyNumber(age);
        //Here we create the Boxx type object with the MyNumber type
        Boxx<MyNumber> boxx=new Boxx<>();
        //Here we pass the MyNumber object in Boxx class
        boxx.add(myNumber);
        //Here we call the display method to display the item.
        boxx.display();
        sc.close();
    }
}
