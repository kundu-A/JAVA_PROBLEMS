class A{
    public void display(){
        System.out.println("In display method...");
    }
    //Non-static inner class
    class B{
        private int a;
        private int b;
        public B(int a, int b){
            this.a=a;
            this.b=b;
        }
        public void print(){
            System.out.println("In Inner class B, sum of "+a+" and b "+" = "+(a+b));
        }
    }
    //static inner class
    static class C{
        private int a;
        private int b;
        public void setA(int a){
            this.a=a;
        }
        public void setB(int b){
            this.b=b;
        }
        public void print(){
            System.out.println("In Inner class c, subtraction of "+a+" and b "+" = "+(a-b));
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        //Create the object of class A.
        A a=new A();
        a.display();

        //Create the object of class B. - use the object of class A , because class B is non static inner class.
        A.B b=a.new B(10,20);
        b.print();

        //Create the object of class C. - use the class name to create the C class object , because C is a static inner class.
        A.C c=new A.C();
        c.setA(10);
        c.setB(20);
        c.print();
    }
}
