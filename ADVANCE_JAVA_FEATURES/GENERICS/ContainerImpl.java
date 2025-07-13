import java.util.Scanner;

class ContainerImpl<T> implements Container<T>{

    T item=null;
    @Override
    public void add(T item) {
        this.item=item;
    }
    @Override
    public T get() {
        return item;
    }
    public static void main(String[] args) {
        ContainerImpl<String> containerImpl=new ContainerImpl<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name=sc.nextLine();
        containerImpl.add(name);
        System.out.println(containerImpl.get());
        sc.close();
    }
}
