interface A{
    int age=22; // by default all variables in interface are "final" and "static".
    String name="Arpan Kundu";
    void show(); //by default all methods in interface are "public" and "abstract"
    void print();
    default void methodBody(){
        System.out.println("In interface A - use default keyword to give the method implementation inside of an interface.");
    }
}
//Here we extends interface A in interface C like class.
interface C extends A{
    void display();
}
class B implements C{

    //Methods of interface A 
    @Override
    public void show() {
        System.out.println("in show() method of class B which is a method of interface A");
    }

    @Override
    public void print() {
        System.out.println("in print() method of class B which is a method of interface A");
    }

    //Method of interface C
    @Override
    public void display() {
        System.out.println("in display() method of class B which is a method of interface C");
    }
    
}
public class InterfaceConcept {
    public static void main(String[] args) {
        C obj=new B();
        System.out.println("My name is "+A.name+" and my age is "+A.age);
        obj.show();
        obj.print();
        obj.display();
        //We can call this method by the using of object of class B.
        obj.methodBody();
    }
}
