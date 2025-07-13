//Here we are going to two types of value.
public class Pair<K, V> {
    //Create two variable of type K and V.
    private K key;
    private V value;

    //Create a constructor to set values.
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    //Generate Getters to get values.
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
//So at the time of Pair object creation , we are going to use two types of value.