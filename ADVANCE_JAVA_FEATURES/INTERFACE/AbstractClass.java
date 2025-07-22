abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing music...");
    }
}
class Mercedes extends Car{

    @Override
    public void drive() {
        System.out.println("Driving...");
    }
    
}
public class AbstractClass {
    public static void main(String[] args) {
        Car car=new Mercedes();
        car.drive();
        car.playMusic();
    }
}
