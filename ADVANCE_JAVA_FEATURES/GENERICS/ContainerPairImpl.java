import java.util.Scanner;

public class ContainerPairImpl<K,V> implements ContainerPair<K,V>{
    private K key=null;
    private V value=null;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter name: ");
        String name=sc.nextLine();
        ContainerPairImpl<String,String> containerPairImpl=new ContainerPairImpl<>();
        containerPairImpl.add("Your name is", name);
        System.out.println(containerPairImpl.getKey()+" "+containerPairImpl.getValue());
        sc.close();
    }

    @Override
    public void add(K key, V value) {
        this.key=key;
        this.value=value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
