//SAM - Single Abstract Method , which is also means Functional Interface.
//We are going to implement the show method by implementing this interface in another class.

@FunctionalInterface // This annotation will restrict to create multiple methods in interface A , if we create it will shoe compilation error, basically it will give a advice to the JVM that only single method will allowed here.
interface A{
    void show();
}

//We are going to implement the display method by using ofimplementing Anonymus Inner class.
@FunctionalInterface
interface B{
    void display();
}

//We are going to implement the print method by using of Lambda expression.
@FunctionalInterface
interface C{
    void print();
}

class AImplementation implements A{
    public void show(){
        System.out.println("in show method....");
    }
}
public class SAMConcept {
    public static void main(String[] args) {

        //Approach 1:
        A a=new AImplementation();
        a.show();

        //Approach 2:
        B b=new B(){
            public void display(){
                System.out.println("in display method....");
            }
        };
        b.display();

        //Approach 3:
        C c=()->System.out.println("in print method....");
        c.print();
    }
}
