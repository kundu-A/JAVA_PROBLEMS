//Here we are going to implement Generic type constructor.
public class GenericConstructor {

    public <T> GenericConstructor(T value){
        System.out.println(value);
    }

    public <K,V extends Number> GenericConstructor(K key,V value){
        System.out.println(key+" "+value);
    }

    public static void main(String[] args) {
        //Here we pass the String.
        GenericConstructor genericConstructor=new GenericConstructor("Hello");

        //Here we pass the Integer.
        GenericConstructor genericConstructor2=new GenericConstructor(2);

        //Here we pass the Two types of value.
        GenericConstructor genericConstructor3=new GenericConstructor("Age", 22);
    }
}
