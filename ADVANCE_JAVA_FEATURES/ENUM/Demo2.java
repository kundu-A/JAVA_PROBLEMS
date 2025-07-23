enum Laptop{
    //Those are the objects of Laptop.
    MACBOOK(150000),LENEVO(40000),ASUS(55000),DELL(62000),HP;

    //We can create variables in Enum.
    //We use private constructor because objects are already present in that class.
    private int price;

    //We can create constructor in Enum.
    //This will call one time
    private Laptop(){
        System.out.println("In Non-parameterized constructor");
    }
    //This will call 4 times
    private Laptop(int price){
        this.price=price;
        System.out.println("In Parameterized constructor");
    }

    //We can create methods in Enum.
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Laptop lapi=Laptop.ASUS;
        System.out.println(lapi);
        System.out.println("Price of "+lapi+" = "+lapi.getPrice());
        lapi.setPrice(60000);
        System.out.println("Price of "+lapi+" = "+lapi.getPrice());
        System.out.println("************************************************");
        for(Laptop laptop:Laptop.values())
            System.out.println(laptop+" : "+laptop.getPrice());
        
    }
}
