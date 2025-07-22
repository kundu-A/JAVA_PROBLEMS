class A{
    public void display(){
        System.out.println("In display method..");
    }
}
class B{
    public void show(){
        System.out.println("In show method os class B");
    }
    public void print(){
        System.out.println("In print method of class B");
    }
}
abstract class C{
    public abstract void show();
}
public class AnonymusInnerClass {
    public static void main(String[] args) {
        //Here we create the object of class A and then call the display() by the it.
        A obj=new A();
        obj.display();

        //But if we want to change the implementationof this display() method and only use one time , then we should go with Anonymus Inner class instead of creating a new class and apply inheritance to modify this method.

        //In this way we can create anonymus inner class and can modify methods.We can modify multiiple methods not only one method.
        System.out.println("**************************************************************");
        A obj1=new A(){
            public void display(){
                System.out.println("Changing the implementation....");
            }
        };
        //Now we call that method.
        obj1.display();

        System.out.println("********************************************************************");
        B obj3=new B();
        obj3.print();
        obj3.show();

        System.out.println("******************************************************************");
        B obj2=new B(){
            public void show(){
                System.out.println("in show method with new implementation on anonymus class.");
            }
            public void print(){
                System.out.println("in print method with new implementation of anonymus class.");
            }
        };
        obj2.show();
        obj2.print();

        //Implementation of abstract method show of abstract class C.
        System.out.println("*****************************************************************");
        C c=new C() {
            public void show(){
                System.out.println("With new implementation of show method in class C.");
            }
        };
        c.show();
    }
}
