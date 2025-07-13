//Here we use multiple Types.
public interface ContainerPair<K,V> {
    void add(K key,V value);
    K getKey();
    V getValue();
}
