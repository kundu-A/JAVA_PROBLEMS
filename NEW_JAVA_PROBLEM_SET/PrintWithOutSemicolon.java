public class PrintWithOutSemicolon {
    static{
        System.out.println("It will excute before main method.");
    }
    public static void main(String[] args) {
        if(System.out.printf("Arpan")==null){}
        int i=0;
        for(i=0;i<1;System.out.println("Hello!!"))
            i++;
    }
}
