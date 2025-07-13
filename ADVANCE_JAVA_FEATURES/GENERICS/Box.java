//Here we are going to implement Generics in class
public class Box<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
//By using that we can store different types of values here , so at the time of Box (class) usage it is not mendatory to store only a single typed value , we can pass any type of value.
//Instead of T to define type , we can use any thing instead of reserved key , like P,B,G,A,etc. But T is the convention.
//T is placeholder which will be replaced by any type of value at the time of implementation.