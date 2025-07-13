enum Operation{
    ADDITION,SUBTRACTION,MULTIPLICATION,DIVISION;

    public <T extends Number> double performOperation(T a ,T b){
        double result=0;
        switch(this){
            case ADDITION:
                        result=a.doubleValue()+b.doubleValue();
                break;
            case SUBTRACTION:
                        result=a.doubleValue()-b.doubleValue();
                break;
            case MULTIPLICATION:
                        result=a.doubleValue()*b.doubleValue();
                break;
            case DIVISION:
                        result=a.doubleValue()/b.doubleValue();
                break;
            default:System.out.println("Please mention properly");
                break;
        }
        return result;
    }
}
public class GenericEnum {
    public static void main(String[] args) {
        System.out.println(Operation.ADDITION.performOperation(20, 10));
        System.out.println(Operation.SUBTRACTION.performOperation(20, 10));
        System.out.println(Operation.MULTIPLICATION.performOperation(20, 10));
        System.out.println(Operation.DIVISION.performOperation(20, 10));
    }
}