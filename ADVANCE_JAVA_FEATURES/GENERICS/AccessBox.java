public class AccessBox {
    public static void main(String[] args) {
        Box<Integer> box=new Box<>();//Box is now type safe.
        box.setValue(1);
        Integer i=box.getValue();
        System.out.println(i);
    }
}
