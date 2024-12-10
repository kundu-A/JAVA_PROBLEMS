public class IncrementDecrement {
    public static void main(String[] args) {
        int a=5;
        int b;
        b=a++ + ++a + ++a + a++ + --a + a-- + a--;
        System.out.println(b);
        System.out.println(a);
    }
    
}
